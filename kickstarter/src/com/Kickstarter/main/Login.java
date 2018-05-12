package com.Kickstarter.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Login {
	private String login;
	private String password;
	private int option;
	Scanner in = new Scanner(System.in);
	private Projects projects;
	
	
	public Login(Projects projects) {
		this.projects=projects;
	}


	public void very(String login,String password,Users user){
		boolean control = true;
		if(user.getAccount().size()<=0)System.out.println("Login ou Senha não correspondem");
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
									projects.setProject(project);
									break;
								case 3:
									control = false;
								}
								
							}catch(InputMismatchException e){
								System.out.println("Entrada Invalida");
								break;
							}
						}
					}
					else if(aux.getIdentfier()==2) {
						
					}
			}
				else{ System.out.println("Login ou Senha não correspondem");}
		}
	}
}
