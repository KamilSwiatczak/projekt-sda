package sda.projektksiegarnia.book;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);

    List<Book> findAll();

    Optional<Book> findById(long id);
}
