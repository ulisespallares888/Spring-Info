package com.InfoSpring.API.model.dto.author;

import com.InfoSpring.API.domain.Book;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorDto {
    private String name;
    private String lastName;
    private LocalDate birthDay;
    private List<Book> books = new ArrayList<>();
}
