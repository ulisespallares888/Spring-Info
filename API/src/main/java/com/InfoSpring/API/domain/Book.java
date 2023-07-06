package com.InfoSpring.API.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book extends BaseEntity {

    @Column(length = 100, columnDefinition = "varchar(40)", updatable = true, nullable = false)
    private String title;

    @Column(length = 100,columnDefinition = "varchar(40)", updatable = true, nullable = false)
    private String author;

}
