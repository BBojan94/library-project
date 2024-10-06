package com.example.booksapplication.service;

import com.example.booksapplication.model.Book;
import com.example.booksapplication.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> findByTitle (String title) {
        return bookRepository.findByTitle(title);
    }

    public List<Book> findByAuthor (String author) {
        return bookRepository.findByAuthor(author);
    }

    public List<Book> findByTitleAndAuthor (String title, String author) {
        return bookRepository.findByTitleAndAuthor(title, author);
    }

    public List<Book> getAllBooks () {
        return bookRepository.findAll();
    }

}
