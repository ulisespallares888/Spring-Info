package com.InfoSpring.API.model.dto.category;

import com.InfoSpring.API.model.dto.DTO;
import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CategoryDto extends DTO {
    private String nameCategory;
}
