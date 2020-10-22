package com.BookApp;
import com.BookApp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.BookApp.service.BookService;

@SpringBootApplication
public class OnlineBookAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OnlineBookAppApplication.class, args);
	}
	@Autowired
	BookService bookservice;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bookservice.getAllBooks().forEach(System.out::println);
		bookservice.getbyAuthor("Learn java").forEach(System.out::println);
		bookservice.getByCategory("Steve").forEach(System.out::println);
		Book book=bookservice.getById(1);
		System.out.println(book);
		
		
	}

}
