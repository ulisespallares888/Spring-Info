package com.InfoSpring.API.services;

import com.InfoSpring.API.domain.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    List<Category> findAll() throws Exception;

   Category findById(UUID uuid) throws Exception;
}
