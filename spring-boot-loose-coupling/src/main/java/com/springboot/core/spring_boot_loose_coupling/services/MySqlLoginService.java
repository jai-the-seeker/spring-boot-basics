package com.springboot.core.spring_boot_loose_coupling.services;

import org.springframework.stereotype.Component;

@Component
public class MySqlLoginService implements LoginService{

	@Override
	public void login() {
		System.out.println("Login Using MySql");
		
	}

	@Override
	public void logout() {
		System.out.println("Logout using MySql");
		
	}

}
