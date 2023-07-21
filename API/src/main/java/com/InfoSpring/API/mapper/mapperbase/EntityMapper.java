package com.InfoSpring.API.mapper.mapperbase;

import com.InfoSpring.API.domain.BaseEntity;
import com.InfoSpring.API.model.dto.DTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public interface EntityMapper<E extends BaseEntity, D extends DTO> {
    E dtoToEntity(D dto);
    D entityToDto(E entity);
}