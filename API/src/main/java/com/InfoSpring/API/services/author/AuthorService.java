package com.InfoSpring.API.services.author;

import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.services.base.BaseService;

import java.util.UUID;

public interface AuthorService extends BaseService<Author, UUID> {
    Author findAuthorByName(String name) throws Exception;

    Author findAuthorByNameAndLastName(String name, String lastName) throws Exception;
}
