package com.InfoSpring.API.bootstrap;

import com.InfoSpring.API.domain.Book;
import com.InfoSpring.API.model.BookRecordCsv;
import com.InfoSpring.API.repository.BookRepository;
import com.InfoSpring.API.services.csv.book.BookServiceCsv;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Component
public class BootstrapData implements CommandLineRunner {

    private final BookRepository bookRepository;

    private final BookServiceCsv bookServiceCsv;

    @Override
    public void run(String... args) throws Exception {
        log.info("Corriendo BootsrapData");

        loadBookData();
    }

    private void loadBookData() throws FileNotFoundException {
        if (bookRepository.count() < 100){
            File file = ResourceUtils.getFile("classpath:csvdata/book_data.csv");
            List<BookRecordCsv> bookCsvRecordList = bookServiceCsv.convertCSV(file);

            if (!bookCsvRecordList.isEmpty()){
                log.info("Cargando base de datos con libros");
                for (BookRecordCsv bookCsvRecord: bookCsvRecordList) {
                    bookRepository.save(
                            Book.builder()
                                    .uuid(UUID.randomUUID())
                                    .isbn(bookCsvRecord.getIsbn())
                                    .title(bookCsvRecord.getTitle())
                                    .author(bookCsvRecord.getAuthor())
                                    .numberPages(Integer.parseInt(bookCsvRecord.getNumberPage()))
                                    .build()
                    );
                }
            }
        }
    }

}
