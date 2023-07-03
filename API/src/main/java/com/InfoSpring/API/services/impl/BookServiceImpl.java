package com.InfoSpring.API.services.impl;

import com.InfoSpring.API.domain.Book;
import com.InfoSpring.API.repository.BaseRepository;
import com.InfoSpring.API.repository.BookRepository;
import com.InfoSpring.API.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BookServiceImpl extends BaseServiceImpl<Book, UUID> implements BookService{

    @Autowired
    private BookRepository bookRepository;

    public BookServiceImpl(BaseRepository<Book, UUID> baseRepository) {
        super(baseRepository);
    }

}
