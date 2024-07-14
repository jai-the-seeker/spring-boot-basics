package com.springboot.core.spring_boot_core.comp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Father {
	
	private Student student;

	public Father(@Qualifier("student2") Student student) {
		super();
		System.out.println("Creating Father Object");
		this.student = student;
	}

	public void fatherOf() {
		System.out.println("Father of: " + student.getName());
	}
	

	
}
