package com.bookapp.client;

import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceimpl;

public class user {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
BookService service=new BookServiceimpl();
List<Book> booklist= service.getAllBooks();
for(Book book:booklist)
	System.out.println(book);
	
	
}
	}


