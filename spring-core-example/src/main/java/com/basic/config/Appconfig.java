package com.basic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.basic.components.Wheel;

@Configuration
@ComponentScan(basePackages= {"com.basic.components"})
public class Appconfig {
	
	// Create Beans
	@Bean
	public Wheel wheel() {
		return new Wheel();
	}
	
}
