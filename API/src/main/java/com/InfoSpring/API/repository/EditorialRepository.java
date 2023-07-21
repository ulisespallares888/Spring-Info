package com.InfoSpring.API.repository;

import com.InfoSpring.API.domain.Editorial;
import com.InfoSpring.API.model.dto.editorial.EditorialDto;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface EditorialRepository extends BaseRepository<Editorial, UUID> {
}
