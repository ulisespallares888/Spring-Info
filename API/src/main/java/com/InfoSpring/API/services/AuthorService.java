package com.InfoSpring.API.services;

import com.InfoSpring.API.domain.Author;

import java.util.UUID;

public interface AuthorService extends BaseService<Author, UUID> {
    Author findAuthorByName(String name) throws Exception;

    Author findAuthorByNameAndLastName(String name, String lastName) throws Exception;
}
