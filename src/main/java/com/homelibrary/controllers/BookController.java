package com.homelibrary.controllers;

import com.homelibrary.models.Book;
import com.homelibrary.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books/")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("register")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        bookService.createBook(book);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("books")
    public List<Book> getBook() {
        return bookService.getAllBooks();
    }

}
