package com.InfoSpring.API.mapper.book.impl;

import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.domain.Book;
import com.InfoSpring.API.mapper.EntityMapper;

import com.InfoSpring.API.model.dto.book.BookDto;
import jdk.jfr.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class BookMapperImpl implements EntityMapper<Book, BookDto> {
    @Override
    public BookDto entityToDto(Book book) {
        BookDto bookDto = BookDto.builder()
                .isbn(book.getIsbn())
                .title(book.getTitle())
                .numberPages(book.getNumberPages())
                .idAuthor(book.getAuthor().getUuid().toString())
                .build();
        return bookDto;
    }


    @Override
    public Book dtoToEntity(BookDto bookDto) {
        Book book = Book.builder()
                .author(Author.builder().build())
                .numberPages(bookDto.getNumberPages())
                .title(bookDto.getTitle())
                .isbn(bookDto.getIsbn())
                .build();
        return book;
    }

    public List<BookDto> convertEntitiesToDTOs(List<Book> entities) {
        BookMapperImpl bookMapper = new BookMapperImpl();
        List<BookDto> dtos = new ArrayList<>();

        for (Book entity : entities) {
            BookDto bookDto = bookMapper.entityToDto(entity);
            dtos.add(bookDto);
        }

        return dtos;
    }

    public List<Book> dtoconvertToEntities(List<BookDto> entities) {
        BookMapperImpl bookMapper = new BookMapperImpl();
        List<Book> books = new ArrayList<>();

        for (BookDto entity : entities) {
            Book book = bookMapper.dtoToEntity(entity);
            books.add(book);
        }

        return books;
    }


}
