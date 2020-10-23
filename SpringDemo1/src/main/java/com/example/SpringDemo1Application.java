package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.training.GreetService;

@SpringBootApplication
public class SpringDemo1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo1Application.class, args);
	}
	@Autowired
	GreetService greetservice;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		System.out.println(greetservice.greet("Harshitha"));
	}
	
	

}
