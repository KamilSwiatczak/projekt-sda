package sda.projektksiegarnia.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.net.URL;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String isbn;
    private String author;
    private String title;
    private Long price;
    private String picture;

    public Long getPrice() {
        return price;
    }

    public String getPicture() {
        return picture;
    }

    protected Book() {
    }

    public Book(String isbn, String author, String title, Long price, String picture) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.price = price;
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", picture=" + picture +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}

