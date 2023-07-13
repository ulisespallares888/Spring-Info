package com.InfoSpring.API.model.csv;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import lombok.*;

import java.time.LocalDate;



@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
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
    @CsvDate("yyyy-MM-dd")
    private LocalDate creationDate;
}
