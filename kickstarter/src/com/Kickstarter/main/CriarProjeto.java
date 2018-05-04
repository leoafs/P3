package com.Kickstarter.main;

import java.util.Scanner;

public class CriarProjeto {
	private String description;
	private String reward;
	private String status;
	
	public void setAttributes(){
		Scanner in = new Scanner(System.in);
		System.out.println("Descrição do projeto");
		this.description = in.nextLine();

		System.out.println("Recompensas");
		this.reward = in.nextLine();
		
	}
	public String getDescription(){
		return this.description;
	}


}
