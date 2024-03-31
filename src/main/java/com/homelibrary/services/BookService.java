package com.homelibrary.services;

import com.homelibrary.models.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BookService {
    @Transactional
    Book createBook(Book book);

    @Transactional
    List<Book> getAllBooks();
}
