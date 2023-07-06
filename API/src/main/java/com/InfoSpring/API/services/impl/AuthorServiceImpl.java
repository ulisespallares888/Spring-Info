package com.InfoSpring.API.services.impl;

import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.repository.AuthorRepository;
import com.InfoSpring.API.repository.BaseRepository;
import com.InfoSpring.API.services.AuthorService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
@Service
@Slf4j
public class AuthorServiceImpl extends BaseServiceImpl<Author, UUID> implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;
    public AuthorServiceImpl(BaseRepository<Author, UUID> baseRepository) {
        super(baseRepository);
    }

    @Override
    @Transactional
    public Author findAuthorByName(String name) throws Exception {
        try {
            Optional<Author> entityOptional = Optional.ofNullable(authorRepository.findAuthorByName(name));
            log.info("Author returned");
            return entityOptional.get();
        } catch (Exception e){
            log.error(e.getMessage());
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Author findAuthorByNameAndLastName(String name, String lastName) throws Exception {
        try {
            Optional<Author> entityOptional = Optional.ofNullable(authorRepository.findAuthorByNameAndLastName(name,lastName));
            log.info("Author returned");
            return entityOptional.get();
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }
}
