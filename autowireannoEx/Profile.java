package com.autowireannoEx;

import org.springframework.beans.factory.annotation.Autowired;

public class Profile {

	@Autowired
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Profile(){
		System.out.println("Inside Profile constructor");
	}
	
	public void printAge(){
		System.out.println(student.getAge());
	}
	
	public void printName(){
		System.out.println(student.getName());
	}
	
	
}
