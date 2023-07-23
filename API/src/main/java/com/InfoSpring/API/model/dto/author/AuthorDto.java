package com.InfoSpring.API.model.dto.author;


import com.InfoSpring.API.model.dto.DTO;
import com.InfoSpring.API.model.dto.book.BookDto;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@JsonTypeName("authorDto")
public class AuthorDto extends DTO{
    private String name;
    private String lastName;
    private LocalDate birthDay;
    private List<BookDto> booksDto = new ArrayList<>();
}
