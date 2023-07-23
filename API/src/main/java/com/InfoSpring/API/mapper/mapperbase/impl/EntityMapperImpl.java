package com.InfoSpring.API.mapper.mapperbase.impl;

import com.InfoSpring.API.domain.BaseEntity;
import com.InfoSpring.API.mapper.mapperbase.EntityMapper;
import com.InfoSpring.API.model.dto.DTO;
import org.springframework.stereotype.Component;



@Component
public abstract class EntityMapperImpl<E extends BaseEntity, D extends DTO> implements EntityMapper<E,D> {

     public E dtoToEntity(D dto){return null;}
     public D entityToDto(E entity){
          return null;
     }
}
