package com.InfoSpring.API.services.csv.book.impl;


import com.InfoSpring.API.model.BookRecordCsv;
import com.InfoSpring.API.services.csv.book.BookServiceCsv;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;


@Slf4j
@Service
public class BookServiceCsvImpl implements BookServiceCsv {
    @Override
    public List<BookRecordCsv> convertCSV(File file) throws FileNotFoundException {
        List<BookRecordCsv> bookCsvRecordList =
                new CsvToBeanBuilder<BookRecordCsv>(new FileReader(file))
                        .withType(BookRecordCsv.class)
                        .build()
                        .parse();
        log.info("Turning CSV file to books list");
        return bookCsvRecordList;
    }
}
