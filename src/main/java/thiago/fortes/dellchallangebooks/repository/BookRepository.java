package thiago.fortes.dellchallangebooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thiago.fortes.dellchallangebooks.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
