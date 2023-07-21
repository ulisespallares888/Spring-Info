package com.InfoSpring.API.model.dto.editorial;

import com.InfoSpring.API.model.dto.DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class EditorialDto extends DTO {
    private String name;
    private String address;
    private String city;
    private String country;
    private int tel;
    private String webPage;
}
