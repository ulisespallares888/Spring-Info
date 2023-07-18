package com.InfoSpring.API.mapper.category.impl;

import com.InfoSpring.API.domain.Category;
import com.InfoSpring.API.mapper.EntityMapper;
import com.InfoSpring.API.mapper.category.CategoryMapper;
import com.InfoSpring.API.model.dto.category.CategoryDto;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapperImpl implements EntityMapper<Category, CategoryDto>, CategoryMapper {
    @Override
    public Category dtoToEntity(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public CategoryDto entityToDto(Category entity) {
        return null;
    }
}
