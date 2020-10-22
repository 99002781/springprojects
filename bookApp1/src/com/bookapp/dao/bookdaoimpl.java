package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class bookdaoimpl implements bookdao {

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return ShowBookList();
		
	}

	@Override
	public List<Book> getbyAuthor(String author) {
		// TODO Auto-generated method stub
		List<Book> newBookList=new ArrayList<>();
		for(Book book:ShowBookList()) {
			if(book.getAuthor().equals(author))
				newBookList.add(book);
		}
		return newBookList;
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		List<Book> newBookList=new ArrayList<>();
		for(Book book:ShowBookList()) {
			if(book.getCategory().equals(category))
				newBookList.add(book);
		}
		return newBookList;
	}

	@Override
	public Book getById(int Id) {
		// TODO Auto-generated method stub
		for(Book book:ShowBookList()) {
			if(book.getBookId()==Id)
				return book;
		}
		return null;
	}
	private List<Book> ShowBookList(){
		return Arrays.asList(
				new Book("Learn java","Kathy",1,"tech",699.0),
				new Book("7 habbits","Steve",2,"self help",500.0),
				new Book("Learn spring","Rod",3,"tech",1000.0)
				);
	}

}
