package com.InfoSpring.API.mapper.editorial.impl;

import com.InfoSpring.API.domain.Editorial;
import com.InfoSpring.API.mapper.editorial.EditorialMapper;
import com.InfoSpring.API.mapper.mapperbase.impl.EntityMapperImpl;
import com.InfoSpring.API.model.dto.editorial.EditorialDto;
import org.springframework.stereotype.Component;

@Component
public class EditorialMapperImpl extends EntityMapperImpl<Editorial, EditorialDto> implements EditorialMapper {
    @Override
    public Editorial dtoToEntity(EditorialDto editorialDto) {
        Editorial editorial = Editorial.builder()
                                    .name(editorialDto.getName())
                                    .address(editorialDto.getAddress())
                                    .city(editorialDto.getCity())
                                    .country(editorialDto.getCountry())
                                    .tel(editorialDto.getTel())
                                    .webPage(editorialDto.getWebPage())
                                    .build();
        return editorial;
    }


    @Override
    public EditorialDto entityToDto(Editorial entity) {

        EditorialDto editorialDto = EditorialDto.builder()
                                    .name(entity.getName())
                                    .address(entity.getAddress())
                                    .city(entity.getCity())
                                    .country(entity.getCountry())
                                    .tel(entity.getTel())
                                    .webPage(entity.getWebPage())
                                    .build();
        return editorialDto;
    }
}
