package com.InfoSpring.API.mapper.author.impl;

import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.mapper.author.MapperAuthor;
import com.InfoSpring.API.model.dto.author.AuthorDto;

public class MapperAuthorImpl implements MapperAuthor {

    @Override
    public AuthorDto AuthorToAuthorDto(Author author) {
       AuthorDto authorDto = AuthorDto.builder()
               .name(author.getName())
               .birthDay(author.getBirthDay())
               .books(author.getBooks())
               .lastName(author.getLastName())
               .build();
       return authorDto;
    }

    @Override
    public Author AuthorDtoToAuthor(AuthorDto authorDto) {
        Author author = Author.builder()
                .name(authorDto.getName())
                .birthDay(authorDto.getBirthDay())
                .books(authorDto.getBooks())
                .lastName(authorDto.getLastName())
                .build();
        return author;
    }
}
