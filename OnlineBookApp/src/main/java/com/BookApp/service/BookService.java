package com.BookApp.service;
import com.BookApp.model.Book;
import java.util.List;



public interface BookService {
    List<Book> getAllBooks();
    List<Book> getbyAuthor(String author);
    List<Book> getByCategory(String category);
    Book getById(int Id);
}
