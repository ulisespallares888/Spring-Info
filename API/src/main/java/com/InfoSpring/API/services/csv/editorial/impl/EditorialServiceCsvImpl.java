package com.InfoSpring.API.services.csv.editorial.impl;

import com.InfoSpring.API.model.BookRecordCsv;
import com.InfoSpring.API.model.EditorialRecordCsv;
import com.InfoSpring.API.services.csv.editorial.EditorialServiceCsv;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
@Slf4j
@Service
public class EditorialServiceCsvImpl implements EditorialServiceCsv {

    @Override
    public List<EditorialRecordCsv> convertCSV(File file) throws FileNotFoundException {
        List<EditorialRecordCsv> bookCsvRecordList =
                new CsvToBeanBuilder<EditorialRecordCsv>(new FileReader(file))
                        .withType(EditorialRecordCsv.class)
                        .build()
                        .parse();
        log.info("Conviertiendo CSV a lista de editoriales");
        return bookCsvRecordList;
    }
}
