package com.InfoSpring.API.repository;

import com.InfoSpring.API.domain.Author;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface AuthorRepository extends BaseRepository<Author, UUID> {
}
