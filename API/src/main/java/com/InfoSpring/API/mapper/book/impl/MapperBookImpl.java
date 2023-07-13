package com.InfoSpring.API.mapper.book.impl;

import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.domain.Book;
import com.InfoSpring.API.mapper.book.MapperBook;
import com.InfoSpring.API.model.dto.book.BookDto;

public class MapperBookImpl implements MapperBook {
    @Override
    public BookDto BookToBookDto(Book book) {
        BookDto bookDto = BookDto.builder()
                .author(book.getAuthor().getName())
                .isbn(book.getIsbn())
                .title(book.getTitle())
                .numberPages(book.getNumberPages())
                .build();
        return bookDto;
    }

    @Override
    public Book BookDtoToBook(BookDto bookDto) {

        Book book = Book.builder()
                .author(Author.builder().name(bookDto.getAuthor()).build())
                .numberPages(bookDto.getNumberPages())
                .title(bookDto.getTitle())
                .isbn(bookDto.getIsbn())
                .build();
        return book;
    }
}
