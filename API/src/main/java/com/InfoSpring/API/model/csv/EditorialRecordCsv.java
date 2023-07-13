package com.InfoSpring.API.model.csv;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EditorialRecordCsv {

        @CsvBindByName(column = "name")
        private String name;
        @CsvBindByName(column = "address")
        private String address;
        @CsvBindByName(column = "city")
        private String city;
        @CsvBindByName(column = "country")
        private String country;
        @CsvBindByName(column = "tel")
        private String tel;
        @CsvBindByName(column = "web_page")
        private String webPage;

}
