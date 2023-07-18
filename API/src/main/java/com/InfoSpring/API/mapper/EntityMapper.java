package com.InfoSpring.API.mapper;

import com.InfoSpring.API.domain.BaseEntity;
import com.InfoSpring.API.domain.Book;
import com.InfoSpring.API.model.dto.book.BookDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EntityMapper<E extends BaseEntity, DTO> {
    E dtoToEntity(DTO dto);

    DTO entityToDto(E entity);
    // List<DTO> convertEntitiesToDTOs(List<E> entities);
    //List<E> dtoconvertToEntities(List<DTO> dto) ;
}