package com.InfoSpring.API.services.csv.book;

import com.InfoSpring.API.model.csv.BookRecordCsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public interface BookServiceCsv {
    List<BookRecordCsv> convertCSV(File file) throws FileNotFoundException;
}
