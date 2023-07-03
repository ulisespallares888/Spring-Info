package com.InfoSpring.API.repository;

import com.InfoSpring.API.domain.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.UUID;

@NoRepositoryBean
public interface BaseRepository  <E extends BaseEntity, ID extends Serializable> extends JpaRepository<E, ID> {
}
