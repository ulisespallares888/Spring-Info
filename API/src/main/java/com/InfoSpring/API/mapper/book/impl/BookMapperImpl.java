package com.InfoSpring.API.mapper.book.impl;


import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.domain.Book;
import com.InfoSpring.API.mapper.book.BookMapper;
import com.InfoSpring.API.mapper.mapperbase.impl.EntityMapperImpl;
import com.InfoSpring.API.model.dto.book.BookDto;
import com.InfoSpring.API.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Component
public class BookMapperImpl extends EntityMapperImpl<Book, BookDto> implements BookMapper {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public BookDto entityToDto(Book book) {
        BookDto bookDto = BookDto.builder()
                .isbn(book.getIsbn())
                .idAuthor(book.getIsbn())
                .title(book.getTitle())
                .numberPages(book.getNumberPages())
                .idAuthor(book.getAuthor().getUuid().toString())
                .build();
        return bookDto;
    }

    @Override
    public Book dtoToEntity(BookDto bookDto) {
        Book book = Book.builder()
                .uuid(UUID.randomUUID())
                .numberPages(bookDto.getNumberPages())
                .title(bookDto.getTitle())
                .isbn(bookDto.getIsbn())
                .author(authorRepository.getById(UUID.fromString(bookDto.getIdAuthor())))
                .build();
        return book;
    }

    public List<BookDto> convertEntitiesToDTOs(List<Book> entities) {
        List<BookDto> dtos = new ArrayList<>();

        for (Book entity : entities) {
            BookDto bookDto = entityToDto(entity);
            dtos.add(bookDto);
        }

        return dtos;
    }

    public List<Book> dtoconvertToEntities(List<BookDto> entities) {
        List<Book> books = new ArrayList<>();

        for (BookDto entity : entities) {
            Book book = dtoToEntity(entity);
            books.add(book);
        }

        return books;
    }


}
