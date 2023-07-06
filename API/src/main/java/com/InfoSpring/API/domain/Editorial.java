package com.InfoSpring.API.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "editorial")
public class Editorial extends BaseEntity {
    @Column(length = 100, nullable = false)
    private String name;
    @Column(length = 100, nullable = false)
    private String address;
    @Column(length = 50, nullable = false)
    private String city;
    @Column(length = 50, nullable = false)
    private String country;
    @Column(length = 13 ,nullable = false)
    private String tel;
    @Column(length = 100, nullable = false)
    private String webPage;
}
