package com.InfoSpring.API.model.dto.author;


import com.InfoSpring.API.model.dto.DTO;
import com.InfoSpring.API.model.dto.book.BookDto;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorDto extends DTO {
    private String name;
    private String lastName;
    private LocalDate birthDay;
    private List<BookDto> booksDto = new ArrayList<>();
}
