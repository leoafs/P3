package com.Kickstarter.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Login {
	private String login;
	private String password;
	private int option;
	private int option2;
	Scanner in = new Scanner(System.in);
	private Projects projects;
	
	
	public Login(Projects projects) {
		this.projects=projects;
	}


	public void very(String login,String password,Users user){
		boolean control = true;
		
		for(int i = 0;i<user.getAccount().size();i++){
			CriarConta aux = (CriarConta) user.getAccount().get(i);
			
				if(login.equals(aux.getLogin()) && password.equals(aux.getPassword())){
					if(aux.getIdentfier()==0) {
						while(control){
							try{
								System.out.println("1-Explorar Projetos\n2-Criar Projeto\n3-Exit");
								option = in.nextInt();
								switch(option){
								case 1 :
									ArrayList  auxx = projects.getProjects();
									for (int j=0; j<auxx.size();j++){
										CriarProjeto a = (CriarProjeto) auxx.get(j);
										System.out.println((j+1)+":"+a.getDescription());
				
									}
									break;
								case 2:
									CriarProjeto project = new CriarProjeto();
									project.setAttributes();
									
									option2= project.getOption();
									if(option2==1) {
										projects.setProjectwaiting(project);
									}
									//projects.setProject(project);
									break;
								case 3:
									control = false;
									break;
								}
								
							}catch(InputMismatchException e){
								System.out.println("Entrada Invalida");
								break;
							}
						}
					}
					else if(aux.getIdentfier()==1) {
						while(control){
							try{
								System.out.println("1-Explorar Projetos Pendentes\n2-Criar Projeto\n3-Avaliar Projeto\n4-Exit");
								option = in.nextInt();
								switch(option){
								case 1 :
									ArrayList  auxx = projects.getProjectsWaiting();
									for (int j=0; j<auxx.size();j++){
										CriarProjeto a = (CriarProjeto) auxx.get(j);
										System.out.println((j+1)+":"+a.getDescription());
										System.out.println("Aprovar 1-SIN/2NÃO");
										option2=in.nextInt();
										if(option2==1) {
											projects.setProjecs(a);
										}
				
									}
									break;
								case 2:
									CriarProjeto project = new CriarProjeto();
									project.setAttributes();
									System.out.println("Enviar Projeto?: 1-Sim/2-Não");
									
									//projects.setProject(project);
									break;
								case 3:
									
								case 4:
									control = false;
									break;
								}
							}catch(InputMismatchException e){
								System.out.println("Entrada Invalida");
								break;
							}
						}
						
					}
			}
		}
		 System.out.println("Login ou Senha nÃ£o correspondem");

	}
}
