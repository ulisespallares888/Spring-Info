package com.InfoSpring.API.controllers.impl;

import com.InfoSpring.API.domain.Author;
import com.InfoSpring.API.services.impl.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/author")
public class AuthorController extends BaseControllerImpl<Author, AuthorServiceImpl> {
    AuthorServiceImpl authorService;
    @Autowired
    public AuthorController (AuthorServiceImpl authorService){
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
