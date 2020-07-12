package accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.Arrays;

@SpringBootApplication
public class AccessingDataJpaApplication {

//    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class);
    }



}


// save a few books
//
//
//            repository.save(new Book("2929292929", "Jo Nesbo", "Upiory"));
//            repository.save(new Book("8383838383", "Tess Gerristen", "Chirurg"));
//            repository.save(new Book("9449494949", "Robert Galbraith", "Jedwabnik"));
//            repository.save(new Book("995955959", "J. K. Rowling", "Harry Potter"));
//            repository.save(new Book("5959595959", "Carlos Ruis Zafon", "Marina"));

//
// fetch all books
//            log.info("Books found with findAll():");
//            log.info("-------------------------------");
//            for (Book book : repository.findAll()) {
//                log.info(book.toString());
//            }
//            log.info("");

//
//            // fetch an individual book by ID
//            Book book = repository.findById(1L);
//            log.info("Book found with findById(1L):");
//            log.info("--------------------------------");
//            log.info(book.toString());
//            log.info("");
//
//            // fetch books by title
//            log.info("Book found with findByTitle('Harry Potter'):");
//            log.info("--------------------------------------------");
//            repository.findByTitle("Bauer").forEach(bauer -> {
//                log.info(bauer.toString());
//            });
//            // for (Book bauer : repository.findByLastName("Bauer")) {
//            // 	log.info(bauer.toString());
//            // }
//            log.info("");
//        };
//    }
//
//