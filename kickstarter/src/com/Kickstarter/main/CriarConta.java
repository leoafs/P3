package com.Kickstarter.main;

import java.util.Scanner;

public class CriarConta {
	private String login;
	private String password;
	private String firstname;
	private String lastname;
	//private String birthday;
	
	public void setAttributes(){
		Scanner in = new Scanner(System.in);
		// Set First Name
		System.out.println("Nome:");
		this.firstname = in.nextLine();
		// Set Last Name
		System.out.println("Sobrenome:");
		this.lastname = in.nextLine();
		// Set First Login
		System.out.println("Login:");
		this.login = in.nextLine();
		// Set Last Password
		System.out.println("Password:");
		this.password = in.nextLine();
	}
	
	
	

}
