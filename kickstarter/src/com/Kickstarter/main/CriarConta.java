package com.Kickstarter.main;

import java.util.ArrayList;
import java.util.Scanner;

public class CriarConta {
	protected String login;
	protected String password;
	protected String firstname;
	protected String lastname;
	protected int identifier=0;
	private ArrayList <CriarProjeto> projects = new ArrayList();
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
	public String getLogin(){
		return this.login;
	}
	public String getPassword(){
		return this.password;
	}
	public int getIdentfier() {
		return this.identifier;
	}
	public void setProjects(CriarProjeto projects) {
		this.projects.add(projects);
		
	}
	public ArrayList getProjects(){
		return this.projects;
		
	}
	
	

}
