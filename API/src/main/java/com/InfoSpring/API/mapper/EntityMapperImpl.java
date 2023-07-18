package com.InfoSpring.API.mapper;

import com.InfoSpring.API.domain.BaseEntity;
import com.InfoSpring.API.model.dto.DTO;

public class EntityMapperImpl implements EntityMapper<BaseEntity, DTO> {

    @Override
    public BaseEntity dtoToEntity(DTO dto) {
        return null;
    }

    @Override
    public DTO entityToDto(BaseEntity entity) {
        return null;
    }


}
