package com.InfoSpring.API.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "review")
public class Review extends BaseEntity{

    @Column(length = 100,nullable = false)
    private String title;
    @Column(length = 100,nullable = false)
    private String nameBook;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private Integer score;
    @Column(nullable = false)
    private LocalDate creationDate;
}
