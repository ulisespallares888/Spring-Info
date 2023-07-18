package com.InfoSpring.API.mapper.author.impl;

import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.mapper.EntityMapper;
import com.InfoSpring.API.mapper.author.AuthorMapper;
import com.InfoSpring.API.mapper.book.impl.BookMapperImpl;
import com.InfoSpring.API.model.dto.author.AuthorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapperImpl implements EntityMapper<Author,AuthorDto>, AuthorMapper {
    @Autowired
    BookMapperImpl bookMapper;

    @Override
    public AuthorDto entityToDto(Author author) {
       AuthorDto authorDto = AuthorDto.builder()
               .name(author.getName())
               .birthDay(author.getBirthDay())
               .booksDto(bookMapper.convertEntitiesToDTOs(author.getBooks()))
               .lastName(author.getLastName())
               .build();
       return authorDto;
    }



    @Override
    public Author dtoToEntity(AuthorDto authorDto) {
        Author author = Author.builder()
                .name(authorDto.getName())
                .birthDay(authorDto.getBirthDay())
                .books(bookMapper.dtoconvertToEntities(authorDto.getBooksDto()))
                .lastName(authorDto.getLastName())
                .build();
        return author;
    }

}
