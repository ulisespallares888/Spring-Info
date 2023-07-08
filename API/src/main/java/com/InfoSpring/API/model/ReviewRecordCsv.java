package com.InfoSpring.API.model;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class ReviewRecordCsv {

    @CsvBindByName(column = "title")
    private String title;
    @CsvBindByName(column = "name_book")
    private String nameBook;
    @CsvBindByName(column = "content")
    private String content;
    @CsvBindByName(column = "score")
    private Integer score;
    @CsvBindByName(column = "creation_date")
    private LocalDate creationDate;

}
