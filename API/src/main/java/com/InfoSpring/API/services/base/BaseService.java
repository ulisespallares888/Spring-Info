package com.InfoSpring.API.services.base;

import com.InfoSpring.API.domain.BaseEntity;
import com.InfoSpring.API.model.dto.DTO;

import java.util.List;
import java.util.UUID;


public interface BaseService<E extends BaseEntity, ID extends UUID, D extends DTO> {
     List<E> findAll() throws Exception;
     E findById(ID id) throws Exception;
     E save(DTO dto) throws Exception;
     E update(ID id, E entity) throws Exception;
     boolean delete(ID id) throws Exception;
}