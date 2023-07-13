package com.InfoSpring.API.mapper.book;

import com.InfoSpring.API.domain.Book;
import com.InfoSpring.API.model.dto.book.BookDto;

public interface MapperBook {
    BookDto BookToBookDto(Book book);
    Book BookDtoToBook(BookDto bookDto);
}
