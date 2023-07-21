package com.InfoSpring.API.controllers.impl;

import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.mapper.author.AuthorMapper;
import com.InfoSpring.API.mapper.mapperbase.EntityMapper;
import com.InfoSpring.API.mapper.mapperbase.impl.EntityMapperImpl;
import com.InfoSpring.API.model.dto.DTO;
import com.InfoSpring.API.model.dto.author.AuthorDto;
import com.InfoSpring.API.services.author.impl.AuthorServiceImpl;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/author")
public class AuthorController extends BaseControllerImpl<Author, AuthorServiceImpl, AuthorDto> {

    @Autowired
    private  AuthorServiceImpl authorService;
    @Autowired
    private  AuthorMapper authorMapper;

    @Autowired
    public AuthorController (AuthorServiceImpl authorService, AuthorMapper authorMapper){
        super(authorService, (EntityMapperImpl<Author, DTO>) authorMapper);
        this.authorService = authorService;
    }


    @GetMapping("/name/{nameAuthor}")
    public ResponseEntity<?> findAuthorByName(@PathVariable("nameAuthor") String nameAuthor)  {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(authorService.findAuthorByName(nameAuthor));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
    @GetMapping("/search")
    public ResponseEntity<?> findAuthorByNameAndLastName(@RequestParam("nameAuthor") String nameAuthor, @RequestParam("lastNameAuthor") String lastNameAuthor)  {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(authorService.findAuthorByNameAndLastName(nameAuthor,lastNameAuthor));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

}
