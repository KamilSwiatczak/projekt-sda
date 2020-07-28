package sda.projektksiegarnia.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookRepository repository;

    @Autowired
    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String showAll(Model model) {
        model.addAttribute("books", repository.findAll());
        return "book";
    }

    @RequestMapping
    public List<Book> allBooks() {
        return repository.findAll();
    }

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

    @GetMapping("/init")
    public String init(){
        repository.saveAll(List.of(new Book("2131231","ktoś","coś", 39L,"http://www.insignis.pl/wp-content/uploads/2018/03/NCDR_DIF_PL_cover_PL_front-1-723x1024.jpg")));
        return "redirect:/books";
    }
}