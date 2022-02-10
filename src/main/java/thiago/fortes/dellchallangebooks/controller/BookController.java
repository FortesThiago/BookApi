package thiago.fortes.dellchallangebooks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import thiago.fortes.dellchallangebooks.entity.Book;
import thiago.fortes.dellchallangebooks.service.BookService;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/book")
    public Book create(@RequestBody Book book){
        return bookService.create(book);
    }

    @GetMapping
    public List<Book> findBooks(){
        return bookService.findAllBooks();
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(Long id){
        bookService.deleteBookById(id);
    }
}
