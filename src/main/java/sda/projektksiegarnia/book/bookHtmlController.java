package sda.projektksiegarnia.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class bookHtmlController {
    @GetMapping("/all")
    public String getBooks() {

        return "books";
    }
}
