package com.threedots.bookstore.controller;

import com.threedots.bookstore.model.BookShop;
import com.threedots.bookstore.service.BookShopService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api/bookstore")
@AllArgsConstructor
public class BookShopController {
    private final BookShopService bookShopService;

    @GetMapping("/")
    public List<BookShop> getAllBookShops() {
        System.out.println("Get all bookshops");
        return bookShopService.getAllBookShops();
    }

    @PostMapping("/")
    public BookShop addNewBookShop(@RequestBody BookShop newBookShop) {
        System.out.println("Add newBookShop: " + newBookShop);
        return bookShopService.addNewBookShop(newBookShop);
    }

    @GetMapping("/addBook")
    public BookShop addNewBookToBookShopById(@RequestParam(value="bookId") Long bookId, @RequestParam(value="bookShopId") Long bookShopId) {
        System.out.println("Add book with id: " + bookId + " to bookshop with id: " + bookShopId);
        return bookShopService.addNewBookToBookShopById(bookId, bookShopId);
    }
}
