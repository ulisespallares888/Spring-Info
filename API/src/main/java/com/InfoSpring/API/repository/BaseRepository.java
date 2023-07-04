package com.InfoSpring.API.repository;

import com.InfoSpring.API.domain.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import java.util.UUID;

@NoRepositoryBean
public interface BaseRepository  <E extends BaseEntity, ID extends UUID> extends JpaRepository<E, ID> {
}
