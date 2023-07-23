package com.InfoSpring.API.services.editorial.impl;

import com.InfoSpring.API.domain.Editorial;
import com.InfoSpring.API.mapper.editorial.impl.EditorialMapperImpl;
import com.InfoSpring.API.model.dto.editorial.EditorialDto;
import com.InfoSpring.API.repository.BaseRepository;
import com.InfoSpring.API.repository.EditorialRepository;
import com.InfoSpring.API.services.editorial.EditorialService;
import com.InfoSpring.API.services.base.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class EditorialServiceImpl extends BaseServiceImpl<Editorial, UUID, EditorialDto> implements EditorialService {
    @Autowired
    private final EditorialRepository editorialRepository;
    @Autowired
    public EditorialServiceImpl(BaseRepository<Editorial, UUID> baseRepository, EditorialMapperImpl entityMapper, EditorialRepository editorialRepository) {
        super(baseRepository,entityMapper);
        this.editorialRepository = editorialRepository;
    }

}
