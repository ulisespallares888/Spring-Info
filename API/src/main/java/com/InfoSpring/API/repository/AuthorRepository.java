package com.InfoSpring.API.repository;

import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.model.dto.author.AuthorDto;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface AuthorRepository extends BaseRepository<Author, UUID> {
    Author findAuthorByName(String name);
    Author findAuthorByNameAndLastName(String name, String lastName);
}
