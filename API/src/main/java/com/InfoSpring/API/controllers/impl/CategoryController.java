package com.InfoSpring.API.controllers.impl;


import com.InfoSpring.API.services.category.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
@RequestMapping("api/v1/category")
public class CategoryController {

    @Autowired
    private final CategoryServiceImpl categoryService;
    @Autowired
    public CategoryController(CategoryServiceImpl categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("")
    public ResponseEntity<?> findAllCategories()  {
       try {
           return ResponseEntity.status(HttpStatus.OK).body(categoryService.findAll());
       } catch (Exception e){
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
       }
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findCategoryById(@PathVariable(value = "id") UUID idCategory)  {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(categoryService.findById(idCategory));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

}
