package sda.projektksiegarnia.book.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sda.projektksiegarnia.book.Book;
import sda.projektksiegarnia.book.BookRepository;

import java.util.List;


@Controller
@RequestMapping("/books")
public class BookView {

    private final BookRepository repository;

    @Autowired
    public BookView(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/addbook")
    public String addBook(Model model){
        model.addAttribute("book", new BookDto());
        return "addBook";
    }

    @GetMapping
    public String showAll(Model model) {
        model.addAttribute("books", repository.findAll());
        return "book";
    }

    @GetMapping("/init")
    public String init() {
        repository.saveAll(List.of(new Book("2131231", "ktoś", "coś", 39L, "http://www.insignis.pl/wp-content/uploads/2018/03/NCDR_DIF_PL_cover_PL_front-1-723x1024.jpg")));
        return "redirect:/books";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute BookDto book){
    Book addedBook = new Book(
                book.getIsbn(),
                book.getAuthor(),
                book.getTitle(),
                book.getPrice(),
                book.getPicture()
        );
    repository.save(addedBook);
    return "redirect:/books";
    }
}
