package sda.projektksiegarnia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class HelloController {
        @GetMapping("/")
        String hello() {
            return "Tu powinny pojawić się książki. Kiedyś uda nam się je dodać ;) ";
        }
    }