package com.InfoSpring.API.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Author extends BaseEntity {

    @Column(length = 40,columnDefinition = "varchar(40)",updatable = true,nullable = false)
    private String name;

    @Column(length = 40,columnDefinition = "varchar(40)",updatable = true,nullable = false)
    private String lastName;

    @Column
    private LocalDate birthDay;

}
