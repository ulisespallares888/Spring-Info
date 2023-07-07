package com.InfoSpring.API.repository;

import com.InfoSpring.API.domain.Editorial;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface EditorialRepository extends BaseRepository<Editorial, UUID> {
}
