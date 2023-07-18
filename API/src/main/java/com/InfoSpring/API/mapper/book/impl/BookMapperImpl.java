package com.InfoSpring.API.mapper.book.impl;

import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.domain.Book;
import com.InfoSpring.API.mapper.EntityMapper;

import com.InfoSpring.API.model.dto.book.BookDto;
import jdk.jfr.Category;
import org.springframework.stereotype.Component;



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


}
