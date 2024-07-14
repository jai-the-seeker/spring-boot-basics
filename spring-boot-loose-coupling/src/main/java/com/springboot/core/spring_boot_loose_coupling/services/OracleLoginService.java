package com.springboot.core.spring_boot_loose_coupling.services;

import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleLoginService implements LoginService{

	@Override
	public void login() {
		System.out.println("Login Using Oracle");
		
	}

	@Override
	public void logout() {
		System.out.println("Logout using Oracle");
		
	}

}
