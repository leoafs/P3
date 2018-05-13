package com.Kickstarter.main;

import java.util.Scanner;

public class CriarProjeto {
	private String description;
	private String reward;
	private int option=0;
	private StatusProject status;
	
	public void setAttributes(){
		Scanner in = new Scanner(System.in);
		System.out.println("Descrição do projeto");
		this.description = in.nextLine();

		System.out.println("Recompensas");
		this.reward = in.nextLine();
		System.out.println("Enviar Projeto?: 1-Sim/2-N�o");
		option = in.nextInt();
		switch(option) {
		case 1:
			this.status = status.ENVIADO;
			break;
		default:
			this.status=status.AGUARDANDO;
			
			}
		
	}
	public int getOption() {
		return this.option;
	}
	public String getDescription(){
		return this.description;
	}
	public StatusProject getStatus() {
		return this.status;
	}
	public void setStatusApproved() {
		status=status.PUBLICADO;
		
	}

}
