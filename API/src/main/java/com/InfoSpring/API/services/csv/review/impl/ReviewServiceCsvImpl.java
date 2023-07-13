package com.InfoSpring.API.services.csv.review.impl;

import com.InfoSpring.API.model.csv.ReviewRecordCsv;
import com.InfoSpring.API.services.csv.review.ReviewServiceCsv;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
@Slf4j
@Service
public class ReviewServiceCsvImpl implements ReviewServiceCsv {
    @Override
    public List<ReviewRecordCsv> convertCSV(File file) throws FileNotFoundException {
        try {
            List<ReviewRecordCsv> reviewRecordCsvlist =
                    new CsvToBeanBuilder<ReviewRecordCsv>(new FileReader(file))
                            .withType(ReviewRecordCsv.class)
                            .build()
                            .parse();
            log.info("Turning CSV file to reviews");
            return reviewRecordCsvlist;
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return null;
    }
}
