package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.Book;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemoryBookService {


    private List<Book> list;

    private static long nextId = 4;

    public MemoryBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz glowa, Java.",
                "Sierra Kathy, Bates Bert", "Helion", "programming"));
        list.add(new Book(3L, "9780130819338", "Java 2. Podstawy",
                "Cay Horstmann, Gary Cornell", "Helion", "programming"));
    }

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }

    public Book getBookById(long id) {

        for (Book book : list) {
            if (book.getId() == id) return book;
        }

        return null;
    }

    public String addNewBook(Book book) {

        boolean alreadyExist = false;
        for (Book b : list) {
            if (b.equals(book)) {
                alreadyExist = true;
                break;
            }
        }
        if (alreadyExist == false) {
            book.setId(this.nextId++);
            this.list.add(book);
            return "added";
        }
        return "already exist";
    }

    public String updateBook(long id, Book book) {

        for (Book b : list){

            if (b.getId() == id){
                b.setIsbn(book.getIsbn());
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
                b.setPublisher(book.getPublisher());
                b.setType(book.getType());
                return "updated";
            }
        }
        return "not exist";
    }
}