package accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class);
    }

    @Bean
    public CommandLineRunner demo(BookRepository repository) {
        return (args) -> {
            // save a few customers
            repository.save(new Book("2929292929", "Jo Nesbo", "Upiory"));
            repository.save(new Book("8383838383", "Tess Gerristen", "Chirurg"));
            repository.save(new Book("9449494949", "Robert Galbraith", "Jedwabnik"));
            repository.save(new Book("995955959", "J. K. Rowling", "Harry Potter"));
            repository.save(new Book("5959595959", "Carlos Ruis Zafon", "Marina"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Book customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual book by ID
            Book book = repository.findById(1L);
            log.info("Book found with findById(1L):");
            log.info("--------------------------------");
            log.info(book.toString());
            log.info("");

            // fetch customers by last name
            log.info("Book found with findByTitle('Harry Potter'):");
            log.info("--------------------------------------------");
            repository.findByTitle("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            // for (Customer bauer : repository.findByLastName("Bauer")) {
            // 	log.info(bauer.toString());
            // }
            log.info("");
        };
    }

}
