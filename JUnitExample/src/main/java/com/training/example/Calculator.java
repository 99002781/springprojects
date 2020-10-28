package com.training.example;

public class Calculator {
	public int sum(int x,int y) {
		return x+y;
	}
	public int subtraction(int x,int y) {
		return x-y;
	}
	public int division(int x,int y) {
		return x/y;
	}
	public double average(int x,int y,int z) throws ExceedingException{
		if(x>100||y>100||z>100) {
			throw new ExceedingException("values cannot be greater than 100");
		}
		if(x<0||y<0||z<0) {
			throw new NegativeValueException("value is less than 0");
		}
		int a=(x+y+z)/3;
		return a;
	}

}
