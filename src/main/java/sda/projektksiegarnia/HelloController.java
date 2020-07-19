package sda.projektksiegarnia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HelloController {

    @GetMapping("/")
    public String get() {
        return "hello";
    }
    @GetMapping("/books")
    public String getBooks() {

        return "books";
    }
}