package com.BookApp.dao;
import com.BookApp.model.Book;
import java.util.List;



public interface bookdao {
	List<Book> getAllBooks();
    List<Book> getbyAuthor(String author);
    List<Book> getByCategory(String category);
    Book getById(int Id);
}
