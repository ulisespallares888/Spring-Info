package com.InfoSpring.API.services.category.impl;

import com.InfoSpring.API.domain.Category;
import com.InfoSpring.API.repository.CategoryRepository;
import com.InfoSpring.API.services.category.CategoryService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {
    CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    @Transactional
    public List<Category> findAll() throws Exception {
        try{
            List<Category> categoryList = categoryRepository.findAll();
            log.info("Retuned all categories");
            return categoryList;
        } catch (Exception e){
            log.error(e.getMessage());
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Category findById(UUID uuid) throws Exception {
        try {
            Optional<Category> categoryOptional = categoryRepository.findById(uuid);
            log.info("Category returned");
            return categoryOptional.get();
        }
        catch (Exception e){
            log.error(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }
}
