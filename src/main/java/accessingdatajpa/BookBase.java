package accessingdatajpa;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
@Configuration
public class BookBase {
    @Bean
    public ApplicationRunner initializer(BookRepository repository) {
        return (args) -> repository.saveAll(Arrays.asList(
                new Book("2929292929", "Jo Nesbo", "Upiory"),
                new Book("8383838383", "Tess Gerristen", "Chirurg"),
                new Book("9449494949", "Robert Galbraith", "Jedwabnik"),
                new Book("2929292929", "J. K. Rowling", "Harry Potter"),
                new Book("995955959", "Carlos Ruis Zafon", "Marina")
        ));
    }
}
