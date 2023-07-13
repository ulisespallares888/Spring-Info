package com.InfoSpring.API.model.dto.book;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDto {
    private String title;
    private String author;
    private String isbn;
    private int numberPages;
}
