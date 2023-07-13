package com.InfoSpring.API.mapper.author;

import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.model.dto.author.AuthorDto;

public interface MapperAuthor {
    AuthorDto AuthorToAuthorDto(Author author);
    Author AuthorDtoToAuthor(AuthorDto authorDto);
}
