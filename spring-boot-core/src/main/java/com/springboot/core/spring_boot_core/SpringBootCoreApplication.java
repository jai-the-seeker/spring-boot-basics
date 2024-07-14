package com.springboot.core.spring_boot_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.core.spring_boot_core.comp.Father;
import com.springboot.core.spring_boot_core.comp.Student;

@SpringBootApplication
public class SpringBootCoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootCoreApplication.class, args);
		
//		Student student = applicationContext.getBean(Student.class);
//		
//		System.out.println(student);
//		student.study();
		
//		### Example Use of Qualifiers
//
//		Consider a `Father` class that requires a `Student` object. The `Student` class is managed by Spring Boot due to the `@Component` annotation. Additionally, there may be methods in a `@Configuration` class that use the `@Bean` annotation to return `Student` objects.
//
//		Now, there is ambiguity as to which `Student` object to inject into the `Father` class. This ambiguity is resolved by using qualifier tags. If no qualifier is specified, Spring will use the default `Student` bean, typically the one marked with `@Component`.

		Father father = applicationContext.getBean(Father.class);
		
		System.out.println(father);
		father.fatherOf();
		
	}

}
