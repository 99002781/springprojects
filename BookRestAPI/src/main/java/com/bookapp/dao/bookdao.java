package com.bookapp.dao;

import java.util.List;

import com.bookapp.model.Book;

public interface bookdao {
	List<Book> getAllBooks();
    List<Book> getbyAuthor(String author);
    List<Book> getByCategory(String category);
    Book getById(int Id);
}
