package com.training;

import java.util.function.Consumer;
import java.util.function.Predicate;

interface Calculator{
	void Calculate(int x,int y);
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=(int x,int y)->System.out.println(x*y);
		calc.Calculate(6, 8);
		Consumer<String>con=(s)->System.out.println(s.toUpperCase());
		con.accept("Hello");
		Consumer<Integer>in=(t)->System.out.println("Sq"+t*t);
		in.accept(10);
		Predicate<String>pred1=(s)-> s.length()>5;
		System.out.println(pred1.test("Hello"));
		pred1=(s)->s.toLowerCase().equals("welcome");
		System.out.println(pred1.test("Welcome"));
	}

}
