package com.InfoSpring.API.controllers.impl;

import com.InfoSpring.API.domain.Book;
import com.InfoSpring.API.services.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/v1/book")//Anotacion a nivel de clase
public class BookController extends BaseControllerImpl<Book, BookServiceImpl> {

    BookServiceImpl bookService;
    @Autowired
    public BookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/title/{titleBook}")
    public ResponseEntity<?> findBookByTitle(@PathVariable("titleBook") String titleBook){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(bookService.findBookByTitle(titleBook));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

}
