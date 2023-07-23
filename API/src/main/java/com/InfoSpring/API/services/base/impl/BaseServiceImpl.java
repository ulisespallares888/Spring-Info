package com.InfoSpring.API.services.base.impl;

import com.InfoSpring.API.domain.BaseEntity;
import com.InfoSpring.API.mapper.mapperbase.EntityMapper;
import com.InfoSpring.API.model.dto.DTO;
import com.InfoSpring.API.repository.BaseRepository;
import com.InfoSpring.API.services.base.BaseService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Slf4j
public abstract class BaseServiceImpl <E extends BaseEntity, ID extends UUID, D extends DTO> implements BaseService<E,ID,D> {

    protected BaseRepository<E, ID> baseRepository;
    protected EntityMapper<E,D> entityMapper;
    @Autowired
    public BaseServiceImpl(BaseRepository<E, ID> baseRepository, EntityMapper<E,D> entityMapper ) {
        this.baseRepository = baseRepository;
        this.entityMapper = entityMapper;
    }


    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try{
            List<E> entities = baseRepository.findAll();
            log.info("Retuned all elements");
            return entities;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            log.info("Returned only one element");
            return entityOptional.get();
        } catch (Exception e){
            log.error(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(DTO dto) throws Exception {
        try{

            log.info("Dentro de la ejecucion de servicio.save(dto) en BaseServiceImpl");
            log.info(dto.toString()+"en el service");

            E entitySaved = entityMapper.dtoToEntity((D) dto);

            log.info(entitySaved.toString()+" entitySaved en el service");

            entitySaved = baseRepository.save(entitySaved);
            log.info("Resource created");
            return entitySaved;
        } catch (Exception e){
            log.error(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            E entityUpdate = baseRepository.save(entity);
            log.info("Resource updated");
            return entityUpdate;
        } catch (Exception e){
            log.error(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try{
            if (baseRepository.existsById(id)){
                baseRepository.deleteById(id);
                log.info("Resource deleted");
                log.info("Resource deleted");
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e){
            log.error(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }
}
