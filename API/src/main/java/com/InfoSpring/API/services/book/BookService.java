package com.InfoSpring.API.services.book;

import com.InfoSpring.API.domain.Book;
import com.InfoSpring.API.services.base.BaseService;

import java.util.UUID;

public interface BookService extends BaseService<Book, UUID> {
    Book findBookByTitle(String title) throws Exception;
}
