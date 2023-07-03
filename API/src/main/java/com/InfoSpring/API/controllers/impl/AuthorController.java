package com.InfoSpring.API.controllers.impl;

import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.services.impl.AuthorServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/author")
public class AuthorController extends BaseControllerImpl<Author, AuthorServiceImpl> {
}
