package accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class BookController {
    private BookRepository repository;

    @Autowired
    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/books")
    public @ResponseBody Iterable<Book> allBooks() {
        return repository.findAll();
    }

    @RequestMapping(path="/books",method=POST)
    public @ResponseBody Book addBook(@RequestBody Book book) {
        return repository.save(book);
    }
}
