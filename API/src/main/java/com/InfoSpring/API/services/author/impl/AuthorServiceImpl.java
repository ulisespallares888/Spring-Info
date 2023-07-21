package com.InfoSpring.API.services.author.impl;

import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.mapper.author.impl.AuthorMapperImpl;
import com.InfoSpring.API.mapper.mapperbase.EntityMapper;
import com.InfoSpring.API.model.dto.DTO;
import com.InfoSpring.API.model.dto.author.AuthorDto;
import com.InfoSpring.API.repository.AuthorRepository;
import com.InfoSpring.API.repository.BaseRepository;
import com.InfoSpring.API.services.author.AuthorService;
import com.InfoSpring.API.services.base.impl.BaseServiceImpl;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.UUID;
@Slf4j
@Service
public class AuthorServiceImpl extends BaseServiceImpl<Author, UUID, AuthorDto> implements AuthorService {

    @Autowired
    private final AuthorRepository authorRepository;
    @Autowired
    AuthorMapperImpl entityMapper;
    @Autowired
    public AuthorServiceImpl(BaseRepository<Author, UUID> baseRepository, AuthorMapperImpl entityMapper, AuthorRepository authorRepository) {
        super(baseRepository, entityMapper);
        this.authorRepository = authorRepository;
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
