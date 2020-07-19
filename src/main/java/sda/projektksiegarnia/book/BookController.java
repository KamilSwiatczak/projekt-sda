package sda.projektksiegarnia.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository repository;

    @Autowired
    public BookController(BookRepository repository) {
        this.repository = repository;
    }


//    @RequestMapping
//    public List<Book> allBooks() {
//        return repository.findAll();
//    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Book addBook(@RequestBody Book book) {
        return repository.save(book);
    }

    @DeleteMapping("/books")
    @ResponseStatus(NO_CONTENT)
    public void deleteAll() {
        repository.deleteAll();
    }
}
