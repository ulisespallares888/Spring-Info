package com.InfoSpring.API.services;

import com.InfoSpring.API.domain.Book;

import java.util.UUID;

public interface BookService extends BaseService<Book, UUID> {
    Book findBookByTitle(String title) throws Exception;
}
