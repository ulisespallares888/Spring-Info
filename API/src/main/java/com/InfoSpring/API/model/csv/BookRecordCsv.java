package com.InfoSpring.API.model.csv;

import com.InfoSpring.API.domain.Author;
import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookRecordCsv {
    @CsvBindByName(column = "isbn")
    private String isbn;
    @CsvBindByName(column = "title")
    private String title;
    @CsvBindByName(column = "author")
    private Author author;
    @CsvBindByName(column = "number_page")
    private String numberPage;
}
