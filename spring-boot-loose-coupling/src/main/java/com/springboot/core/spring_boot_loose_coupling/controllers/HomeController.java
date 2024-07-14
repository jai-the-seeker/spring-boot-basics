package com.springboot.core.spring_boot_loose_coupling.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springboot.core.spring_boot_loose_coupling.services.LoginService;

@Component
public class HomeController {
	private LoginService loginservice;

	public HomeController(@Qualifier("oracle")LoginService loginservice) {
		super();
		this.loginservice = loginservice;
	}
	
	public void loginUser() {
		loginservice.login();
		System.out.println("Logged In Success");
	}
	
	public void logoutUser() {
		loginservice.logout();
		System.out.println("Logged Out Success");
	}
	
}
