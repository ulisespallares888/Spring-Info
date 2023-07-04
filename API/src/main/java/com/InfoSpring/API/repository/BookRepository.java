package com.InfoSpring.API.repository;

import com.InfoSpring.API.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface BookRepository extends BaseRepository<Book, UUID> {
    Book findBookByTitle(String title) throws Exception;
}
