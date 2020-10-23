package com.lts.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	String coursename;
	Double price;
	public String getCoursename() {
		return coursename;
	}
	@Value("${student.course.coursename}")
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public Double getPrice() {
		return price;
	}
	@Value("${student.course.price}")
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [coursename=" + coursename + ", price=" + price + "]";
	}
	
	
}
