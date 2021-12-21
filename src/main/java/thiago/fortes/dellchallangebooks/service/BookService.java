package thiago.fortes.dellchallangebooks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thiago.fortes.dellchallangebooks.entity.Book;
import thiago.fortes.dellchallangebooks.repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    @Autowired
    public BookRepository bookRepository;

    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }

    public Book create(Book book){
        return bookRepository.save(book);
    }

    public void deleteBookById(Long id){
        bookRepository.deleteById(id);
    }
}
