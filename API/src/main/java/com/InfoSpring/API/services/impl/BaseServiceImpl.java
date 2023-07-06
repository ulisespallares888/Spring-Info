package com.InfoSpring.API.services.impl;

import com.InfoSpring.API.domain.BaseEntity;
import com.InfoSpring.API.repository.BaseRepository;
import com.InfoSpring.API.services.BaseService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Slf4j
public abstract class BaseServiceImpl <E extends BaseEntity, ID extends UUID> implements BaseService<E,ID> {
    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
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
    public E save(E entity) throws Exception {
        try{
            entity = baseRepository.save(entity);
            log.info("Resource created");
            return entity;
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
