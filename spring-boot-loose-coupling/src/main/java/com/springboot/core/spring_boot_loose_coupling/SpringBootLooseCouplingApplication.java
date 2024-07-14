package com.springboot.core.spring_boot_loose_coupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.core.spring_boot_loose_coupling.controllers.HomeController;

@SpringBootApplication
public class SpringBootLooseCouplingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =  SpringApplication.run(SpringBootLooseCouplingApplication.class, args);
		
		HomeController controller = applicationContext.getBean(HomeController.class);
		controller.loginUser();
		controller.logoutUser();
	}

}
