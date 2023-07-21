package com.InfoSpring.API.controllers.impl;

import com.InfoSpring.API.controllers.BaseController;
import com.InfoSpring.API.domain.BaseEntity;
import com.InfoSpring.API.mapper.mapperbase.EntityMapper;
import com.InfoSpring.API.mapper.mapperbase.impl.EntityMapperImpl;
import com.InfoSpring.API.model.dto.DTO;
import com.InfoSpring.API.services.base.impl.BaseServiceImpl;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.domain.QAbstractAuditable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Component
public abstract class BaseControllerImpl<E extends BaseEntity, S extends BaseServiceImpl<E, UUID, D>, D extends DTO> implements BaseController<E, UUID>{
    @Autowired
    protected S servicio;

    protected  EntityMapper<E,DTO> entityMapper ;
    @Autowired
    public BaseControllerImpl(S servicio, EntityMapperImpl<E, DTO> entityMapper) {
        this.servicio = servicio;
        this.entityMapper = entityMapper;
    }

    private static final String PATH_V1 = "/api/v1/";

    protected BaseControllerImpl() {
    }

    @Override
    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(convertEntitiesToDTOs(servicio.findAll()));
        } catch (Exception e) {
            log.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    private List<DTO> convertEntitiesToDTOs(List<E> entities) {

        List<DTO> dtos = new ArrayList<>();

        for (E entity : entities) {
            DTO dto = entityMapper.entityToDto(entity);
            log.info(dto.toString());
            dtos.add(dto);
        }

        return dtos;
    }

    private E convertDtoToEntity(DTO dto) {
        return entityMapper.dtoToEntity(dto);
    }



    @Override
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable(value = "id") UUID id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @Override
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody DTO dto){
        try {
            E entitySaved = servicio.save(dto);
            String header = PATH_V1 + entitySaved.getClass().getSimpleName().toLowerCase() +"/"+ entitySaved.getUuid();
            return ResponseEntity.status(HttpStatus.OK)
                    .header("Location",header)
                    .body(entityMapper.entityToDto(entitySaved));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable(value = "id") UUID id, @RequestBody E entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.delete(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

}

