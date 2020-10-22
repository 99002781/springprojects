package com.bookapp.service;

import java.util.List;

import com.bookapp.model.Book;

public interface BookService {
    List<Book> getAllBooks();
    List<Book> getbyAuthor(String author);
    List<Book> getByCategory(String category);
    Book getById(int Id);
}
