package com.example.booksapplication.controller;

import com.example.booksapplication.service.BookService;
import com.example.booksapplication.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> searchBooks (@RequestParam(required = false) String title, @RequestParam(required = false) String author) {

        if (title != null && author != null) {
            return bookService.findByTitleAndAuthor(title, author);
        } else if (title != null) {
            return bookService.findByTitle(title);
        } else if (author != null) {
            return bookService.findByAuthor(author);
        } else
            return bookService.getAllBooks();

    }

}
