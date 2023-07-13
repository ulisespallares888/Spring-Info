package com.InfoSpring.API.services.csv.editorial;

import com.InfoSpring.API.model.csv.EditorialRecordCsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public interface EditorialServiceCsv {
    List<EditorialRecordCsv> convertCSV(File file) throws FileNotFoundException;
}
