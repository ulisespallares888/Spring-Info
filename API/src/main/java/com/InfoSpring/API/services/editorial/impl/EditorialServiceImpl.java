package com.InfoSpring.API.services.editorial.impl;

import com.InfoSpring.API.domain.Editorial;
import com.InfoSpring.API.repository.BaseRepository;
import com.InfoSpring.API.repository.EditorialRepository;
import com.InfoSpring.API.services.editorial.EditorialService;
import com.InfoSpring.API.services.base.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class EditorialServiceImpl extends BaseServiceImpl<Editorial, UUID> implements EditorialService {

    EditorialRepository editorialRepository;
    @Autowired
    public EditorialServiceImpl(BaseRepository<Editorial, UUID> baseRepository) {
        super(baseRepository);
    }
}
