package com.InfoSpring.API.model.dto.editorial;

import com.InfoSpring.API.model.dto.DTO;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
@JsonTypeName("editorialDto")
public class EditorialDto extends DTO {
    private String name;
    private String address;
    private String city;
    private String country;
    private int tel;
    private String webPage;
}
