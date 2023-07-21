package com.InfoSpring.API.controllers.impl;


import com.InfoSpring.API.domain.Editorial;
import com.InfoSpring.API.mapper.editorial.EditorialMapper;
import com.InfoSpring.API.mapper.mapperbase.EntityMapper;
import com.InfoSpring.API.mapper.mapperbase.impl.EntityMapperImpl;
import com.InfoSpring.API.model.dto.DTO;
import com.InfoSpring.API.model.dto.editorial.EditorialDto;
import com.InfoSpring.API.services.editorial.impl.EditorialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/editorial")
public class EditorialController extends BaseControllerImpl<Editorial, EditorialServiceImpl, EditorialDto> {

    @Autowired
    private final EditorialServiceImpl editorialService;
    @Autowired
    private EditorialMapper editorialMapper;

    public EditorialController (EditorialServiceImpl editorialService,  EditorialMapper editorialMapper){
        super(editorialService, (EntityMapperImpl<Editorial, DTO>) editorialMapper);
        this.editorialService = editorialService;
    }

}
