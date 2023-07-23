package com.InfoSpring.API.controllers;

import com.InfoSpring.API.domain.BaseEntity;
import com.InfoSpring.API.model.dto.DTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController<E extends BaseEntity, ID extends Serializable, D extends DTO> {
     ResponseEntity<?> getAll();
     ResponseEntity<?> getOne(@PathVariable ID id);
     ResponseEntity<?> save(@RequestBody D dto);
     ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);
     ResponseEntity<?> delete(@PathVariable ID id);
}
