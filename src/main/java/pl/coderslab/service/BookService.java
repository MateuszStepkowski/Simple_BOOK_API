package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.Book;

import java.util.List;

@Service
public interface BookService {

    public List<Book> getList();

    public void setList(List<Book> list);

    public Book getBookById(long id);

    public String addNewBook(Book book);

    public String updateBook(long id, Book book);

    public String deleteBook(long id);

}