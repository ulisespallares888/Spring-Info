package com.InfoSpring.API.mapper.author.impl;

import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.domain.Book;
import com.InfoSpring.API.mapper.EntityMapper;
import com.InfoSpring.API.mapper.author.AuthorMapper;
import com.InfoSpring.API.mapper.book.impl.BookMapperImpl;
import com.InfoSpring.API.model.dto.DTO;
import com.InfoSpring.API.model.dto.author.AuthorDto;
import com.InfoSpring.API.model.dto.book.BookDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuthorMapperImpl implements EntityMapper<Author,AuthorDto>, AuthorMapper {

    @Override
    public AuthorDto entityToDto(Author author) {
       AuthorDto authorDto = AuthorDto.builder()
               .name(author.getName())
               .birthDay(author.getBirthDay())
               .booksDto(convertEntitiesToDTOs(author.getBooks()))
               .lastName(author.getLastName())
               .build();
       return authorDto;
    }

    private List<BookDto> convertEntitiesToDTOs(List<Book> entities) {
        BookMapperImpl bookMapper = new BookMapperImpl();
        List<BookDto> dtos = new ArrayList<>();

        for (Book entity : entities) {
            BookDto bookDto = bookMapper.entityToDto(entity);
            dtos.add(bookDto);
        }

        return dtos;
    }

    private List<Book> dtoconvertToEntities(List<BookDto> entities) {
        BookMapperImpl bookMapper = new BookMapperImpl();
        List<Book> books = new ArrayList<>();

        for (BookDto entity : entities) {
            Book book = bookMapper.dtoToEntity(entity);
            books.add(book);
        }

        return books;
    }

    @Override
    public Author dtoToEntity(AuthorDto authorDto) {
        Author author = Author.builder()
                .name(authorDto.getName())
                .birthDay(authorDto.getBirthDay())
                .books(dtoconvertToEntities(authorDto.getBooksDto()))
                .lastName(authorDto.getLastName())
                .build();
        return author;
    }

}
