package com.lts.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext("com");
		GreetService service=context.getBean("greetServiceImpl",GreetService.class);
		System.out.println(service.greet("Harshitha"));
	}

}
