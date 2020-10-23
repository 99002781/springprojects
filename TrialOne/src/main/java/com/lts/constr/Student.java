package com.lts.constr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	String name;
	Integer Id;
	String dept;
	@Autowired
	Course course;
	/*public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}*/
	public Student(Course course) {
		this.course = course;
	}
	public String getName() {
		return name;
	}

	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return Id;
	}
	@Value("${student.Id}")
	public void setId(Integer id) {
		Id = id;
	}
	public String getDept() {
		return dept;
	}
	@Value("${student.dept}")
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Id=" + Id + ", dept=" + dept + ", course=" + course + "]";
	}
	
	
}
