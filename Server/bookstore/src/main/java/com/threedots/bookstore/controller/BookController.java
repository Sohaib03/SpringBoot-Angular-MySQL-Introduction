package com.threedots.bookstore.controller;

import com.threedots.bookstore.model.Book;
import com.threedots.bookstore.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api/books")
@AllArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("/")
    public List<Book> getAllBooks() {
        System.out.println("Get all books");
        return bookService.getAllBooks();
    }

    @PostMapping("/")
    public List<Book> addNewBook(@RequestBody List<Book> newBook) {
        System.out.println("Add newBook: " + newBook);
        return bookService.addNewBook(newBook);
    }

    @GetMapping("/byTitle")
    public List<Book> findBookByTitle(@RequestParam(value="title") String title) {
        System.out.println("Find title: " + title);
        return bookService.findBookByTitle(title);
    }

    @GetMapping("/byId")
    public Book findBookById(@RequestParam(value="id") Long id) {
        System.out.println("Find id: " + id);
        Book book = bookService.findBookById(id);
        if (book == null) {
            return null;
        }
        return book;
    }
}
