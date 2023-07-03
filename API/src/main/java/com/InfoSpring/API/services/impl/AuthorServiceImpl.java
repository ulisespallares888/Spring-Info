package com.InfoSpring.API.services.impl;

import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.repository.AuthorRepository;
import com.InfoSpring.API.repository.BaseRepository;
import com.InfoSpring.API.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class AuthorServiceImpl extends BaseServiceImpl<Author, UUID> implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;
    public AuthorServiceImpl(BaseRepository<Author, UUID> baseRepository) {
        super(baseRepository);
    }
}
