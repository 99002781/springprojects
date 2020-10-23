package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.dao.BookRepository;
import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
@Service
public class BookServiceImpl implements BookService {
@Autowired
BookRepository bookRepository;
	
	@Override
	public Book addBook(Book book) {
		Book newbook=bookRepository.save(book);
		return newbook;
	}

	@Override
	public boolean deleteBook(Integer bookid) throws BookNotFoundException {
		bookRepository.deleteById(bookid);
		return true;
	}

	public Book getBookById(Integer bookid) throws BookNotFoundException {
		return bookRepository.findById(bookid)
		.orElseThrow(()->new BookNotFoundException("ID not available"));
	
	}

	@Override
	public Book updateBook(Book book) {
		
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	public List<Book> getbyAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
