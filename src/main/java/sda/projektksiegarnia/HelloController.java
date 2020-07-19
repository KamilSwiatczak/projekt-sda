package sda.projektksiegarnia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URL;


@RestController
    public class HelloController {

    public HelloController() throws MalformedURLException {
    }

    @GetMapping("/")
        String hello() {
            return "WITAMY W NAJLEPSZEJ KSIĘGARNI NA ŚWIECIE!!!\n";
        }

    }