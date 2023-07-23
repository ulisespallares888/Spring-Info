package com.InfoSpring.API.model.dto.book;

import com.InfoSpring.API.model.dto.DTO;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@JsonTypeName("authorDto")
public class BookDto extends DTO {
    private String title;
    private String isbn;
    private int numberPages;
    private String idAuthor;

}
