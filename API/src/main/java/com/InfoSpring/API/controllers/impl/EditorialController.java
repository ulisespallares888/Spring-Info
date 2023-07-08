package com.InfoSpring.API.controllers.impl;


import com.InfoSpring.API.domain.Editorial;
import com.InfoSpring.API.services.editorial.impl.EditorialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/editorial")
public class EditorialController extends BaseControllerImpl<Editorial, EditorialServiceImpl> {

    EditorialServiceImpl editorialService;
    @Autowired
    public EditorialController(EditorialServiceImpl editorialService) {
        this.editorialService = editorialService;
    }


}
