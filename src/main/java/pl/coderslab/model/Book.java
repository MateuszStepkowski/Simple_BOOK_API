package pl.coderslab.model;

import java.util.Objects;

public class Book {

    private long id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getId() == book.getId() &&
                Objects.equals(getIsbn(), book.getIsbn()) &&
                Objects.equals(getTitle(), book.getTitle()) &&
                Objects.equals(getAuthor(), book.getAuthor()) &&
                Objects.equals(getPublisher(), book.getPublisher()) &&
                Objects.equals(getType(), book.getType());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getIsbn(), getTitle(), getAuthor(), getPublisher(), getType());
    }
}
