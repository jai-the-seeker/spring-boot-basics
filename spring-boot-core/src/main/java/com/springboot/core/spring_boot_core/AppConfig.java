package com.springboot.core.spring_boot_core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.core.spring_boot_core.comp.Student;

@Configuration
public class AppConfig {

	@Bean("student2")
	public Student studentMethod1() {
		return new Student("Ram");		
	}
	
	@Bean("student2")
	public Student studentMethod2() {
		return new Student("Shayam");		
	}
}
