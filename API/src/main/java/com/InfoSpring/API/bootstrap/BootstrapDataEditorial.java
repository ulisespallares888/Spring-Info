package com.InfoSpring.API.bootstrap;

import com.InfoSpring.API.domain.Editorial;
import com.InfoSpring.API.model.csv.EditorialRecordCsv;
import com.InfoSpring.API.repository.EditorialRepository;
import com.InfoSpring.API.services.csv.editorial.EditorialServiceCsv;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Slf4j
@Component
public class BootstrapDataEditorial implements CommandLineRunner {

    private final EditorialRepository editorialRepository;

    private final EditorialServiceCsv editorialServiceCsv;
    @Override
    public void run(String... args) throws Exception {
        log.info("Running BootstrapDataEditorial");
        loadEditorialData();
    }

    private void loadEditorialData() throws FileNotFoundException {
        if (editorialRepository.count() < 100){
            File file = ResourceUtils.getFile("classpath:csvdata/editorial_data.csv");
            List<EditorialRecordCsv> editorialRecordCsvList = editorialServiceCsv.convertCSV(file);

            if (!editorialRecordCsvList.isEmpty()){
                log.info("Loading database with editorials");
                for (EditorialRecordCsv editorialRecordCsv: editorialRecordCsvList) {
                    editorialRepository.save(
                            Editorial.builder()
                                    .uuid(UUID.randomUUID())
                                    .name(editorialRecordCsv.getName())
                                    .city(editorialRecordCsv.getCity())
                                    .address(editorialRecordCsv.getAddress())
                                    .country(editorialRecordCsv.getCountry())
                                    .tel(Integer.parseInt(editorialRecordCsv.getTel()))
                                    .webPage(editorialRecordCsv.getWebPage())
                                    .build()
                    );
                }
            }
        }
    }


}
