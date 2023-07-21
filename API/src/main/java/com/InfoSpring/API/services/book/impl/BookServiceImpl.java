package com.InfoSpring.API.services.book.impl;

import com.InfoSpring.API.domain.Book;
import com.InfoSpring.API.mapper.book.impl.BookMapperImpl;
import com.InfoSpring.API.mapper.mapperbase.impl.EntityMapperImpl;
import com.InfoSpring.API.model.dto.book.BookDto;
import com.InfoSpring.API.repository.BaseRepository;
import com.InfoSpring.API.repository.BookRepository;
import com.InfoSpring.API.services.book.BookService;
import com.InfoSpring.API.services.base.impl.BaseServiceImpl;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Slf4j
@Service
public class BookServiceImpl extends BaseServiceImpl<Book, UUID, BookDto> implements BookService {


    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BaseRepository<Book, UUID> baseRepository, BookMapperImpl entityMapper, BookRepository bookRepository) {
        super(baseRepository, entityMapper);
        this.bookRepository = bookRepository;
    }


    @Override
    @Transactional
    public Book findBookByTitle(String title) throws Exception {
        try{
            Optional<Book> entityOptional = Optional.ofNullable(bookRepository.findBookByTitle(title));
            log.info("Book returned");
            return entityOptional.get();
        } catch (Exception e){
            log.error(e.getMessage());
            throw new Exception(e.getMessage());
        }

    }
}
