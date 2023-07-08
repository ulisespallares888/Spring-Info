package com.InfoSpring.API.services.category;

import com.InfoSpring.API.domain.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    List<Category> findAll() throws Exception;

    Category findById(UUID uuid) throws Exception;
}
