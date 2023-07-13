package com.InfoSpring.API.services.csv.review;

import com.InfoSpring.API.model.csv.ReviewRecordCsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public interface ReviewServiceCsv {
    List<ReviewRecordCsv> convertCSV(File file) throws FileNotFoundException;
}
