package hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ksiegarnia", schema = "books", catalog = "")
public class BooksEntity {
    private int id;
    private String title;
    private String author;
    private Double price;
    private Integer qty;
    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Basic
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    @Basic
    @Column(name = "qty")
    public Integer getQty() {
        return qty;
    }
    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public void setQty(Integer qty) {
        this.qty = qty;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BooksEntity that = (BooksEntity) o;
        return id == that.id &&
                Objects.equals(title, that.title) &&
                Objects.equals(author, that.author) &&
                Objects.equals(price, that.price) &&
                Objects.equals(qty, that.qty);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, price, qty);
    }
}