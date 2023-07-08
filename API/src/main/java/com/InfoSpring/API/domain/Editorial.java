package com.InfoSpring.API.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "editorial")
public class Editorial extends BaseEntity {
    @Column(length = 100, nullable = false)
    private String name;
    @Column(length = 100)
    private String address;
    @Column(length = 50, nullable = false)
    private String city;
    @Column(length = 50, nullable = false)
    private String country;
    @Column(length = 13 ,nullable = false)
    private int tel;
    @Column(nullable = false)
    private String webPage;

    @Override
    public String toString() {
        return "Editorial{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", tel='" + tel + '\'' +
                ", webPage='" + webPage + '\'' +
                "} " + super.toString();
    }

    public static EditorialBuilder builder(){
        Editorial editorial = new Editorial();
        return new EditorialBuilder(editorial);
    }

    public static class EditorialBuilder {
        Editorial editorial;

        public EditorialBuilder(Editorial editorial) {
            this.editorial = editorial;
        }

        public Editorial.EditorialBuilder uuid(UUID uuid) {
            this.editorial.setUuid(uuid);
            return this ;
        }


    }

}
