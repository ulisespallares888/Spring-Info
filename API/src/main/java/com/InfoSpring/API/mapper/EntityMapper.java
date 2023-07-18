package com.InfoSpring.API.mapper;

import com.InfoSpring.API.domain.BaseEntity;
import org.springframework.stereotype.Component;


@Component
public interface EntityMapper<E extends BaseEntity, DTO> {
    E dtoToEntity(DTO dto);
    DTO entityToDto(E entity);
}