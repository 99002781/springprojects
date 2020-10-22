package com.bookapp.service;

import java.util.List;

import com.bookapp.dao.bookdao;
import com.bookapp.dao.bookdaoimpl;
import com.bookapp.model.Book;


public class BookServiceimpl implements BookService {
bookdao bookda=new bookdaoimpl();
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookda.getAllBooks();
	}

	@Override
	public List<Book> getbyAuthor(String author) {
		// TODO Auto-generated method stub
		return bookda.getbyAuthor(author);
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		return bookda.getByCategory(category);
	}

	@Override
	public Book getById(int Id) {
		// TODO Auto-generated method stub
		return bookda.getById(Id);
	}
	}


