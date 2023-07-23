package com.InfoSpring.API.services.book;

import com.InfoSpring.API.domain.Book;
import com.InfoSpring.API.model.dto.book.BookDto;
import com.InfoSpring.API.services.base.BaseService;

import java.util.UUID;

public interface BookService extends BaseService<Book, UUID, BookDto> {
    Book findBookByTitle(String title) throws Exception;
}
