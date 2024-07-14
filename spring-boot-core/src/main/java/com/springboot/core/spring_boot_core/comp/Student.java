package com.springboot.core.spring_boot_core.comp;

import org.springframework.stereotype.Component;

@Component("student1")
public class Student {
	
	private String name = "default";

	public Student() {
		super();
		System.out.println("Creating Student Object");
	}		
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public void study() {
		System.out.println("Student is Studying");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
