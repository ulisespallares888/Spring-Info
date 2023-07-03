package com.InfoSpring.API.services;

import com.InfoSpring.API.domain.BaseEntity;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public interface BaseService<E extends BaseEntity, ID extends UUID> {
     List<E> findAll() throws Exception;
     E findById(ID id) throws Exception;
     E save(E entity) throws Exception;
     E update(ID id, E entity) throws Exception;
     boolean delete(ID id) throws Exception;
}