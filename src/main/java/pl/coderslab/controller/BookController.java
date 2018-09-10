package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Book;
import pl.coderslab.service.MemoryBookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    MemoryBookService memoryBookService;

    @RequestMapping("/hello")
    public String hello() {
        return "{hello: World}";
    }

    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }

    @GetMapping("/")
    public List<Book> getAllBooks() {
        return memoryBookService.getList();
    }


    @GetMapping("/{id}")
    public Book getBookById(@PathVariable long id) {
        return memoryBookService.getBookById(id);
    }

    @PostMapping("/")
    public String addNewBook(@RequestBody Book book) {
        return memoryBookService.addNewBook(book);
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable long id, @RequestBody Book book) {
        return memoryBookService.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable long id) {

       return memoryBookService.deleteBook(id);
    }
    

}

