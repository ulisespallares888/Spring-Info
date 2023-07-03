package com.InfoSpring.API.controllers.impl;

import com.InfoSpring.API.domain.Book;
import com.InfoSpring.API.services.impl.BookServiceImpl;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/v1/book")//Anotacion a nivel de clase
public class BookController extends BaseControllerImpl<Book, BookServiceImpl> {

    /*
    //IoC Inversion de control
  //  BookService /bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //GET --> Obtener un recurso
    @GetMapping("/api/v1/book")
    public List<Book> getAllBooks(){

        return bookService.getAllBooks();
    }

    //POST --> Crear un recurso
    @PostMapping("/api/v1/book")
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    //PUT --> Actualizar un recurso
    @PutMapping("/api/v1/book/{idBook}")
    public String updateBook(@PathVariable(value = "idBook")UUID idBook,@RequestBody Book bookUpdated){
        Optional<Book> book = bookService.updateBook(idBook,bookUpdated);

        if(book.isEmpty()){
            System.out.println("Book not found");
            return "Book not found";
        }else {
            System.out.println("Book updated");
            return "/api/v1/book/"+book.get().getUuid();
        }
    }



    @DeleteMapping("/api/v1/book/{titleBook}")
    public String deleteBookByName(@PathVariable(name = "titleBook") String titleBook){
        final boolean deleted = bookService.deleteBookByName(titleBook);
        if(deleted){
            return "{\n Message : Book deleted \n}";
        }
        return "{\n Message : Book not found \n}";
    }

     */

}
