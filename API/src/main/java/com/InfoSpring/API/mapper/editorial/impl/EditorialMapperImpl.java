package com.InfoSpring.API.mapper.editorial.impl;

import com.InfoSpring.API.domain.Editorial;
import com.InfoSpring.API.mapper.EntityMapper;
import com.InfoSpring.API.mapper.editorial.EditorialMapper;
import com.InfoSpring.API.model.dto.editorial.EditorialDto;
import org.springframework.stereotype.Component;

@Component
public class EditorialMapperImpl implements EntityMapper<Editorial, EditorialDto>, EditorialMapper {
    @Override
    public Editorial dtoToEntity(EditorialDto editorialDto) {
        return null;
    }

    @Override
    public EditorialDto entityToDto(Editorial entity) {
        return null;
    }
}
