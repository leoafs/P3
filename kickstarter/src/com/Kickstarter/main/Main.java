package com.Kickstarter.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Users user = new Users();
		Projects project = new Projects();
		
		while(true){
			try{
					System.out.println("1-Explorar Projetos\n2-Iniciar um Projeto\n3-Criar Conta");
					int option = in.nextInt();
				
					switch (option){
					case 3:
						CriarConta newaccount = new CriarConta();
						newaccount.setAttributes();
						user.setUser(newaccount);
						break;
					
					case 1:
						ArrayList  aux = project.getProjects();
						for (int i=0; i<aux.size();i++){
							CriarProjeto a = (CriarProjeto) aux.get(i);
							System.out.println(a.getDescription());
							break;
						}
					default:
						System.out.println("Opção Invalida");
					}
			
			}catch(InputMismatchException e){
				System.out.println("Entrada Invalida");
				break;
				
			}
		}
	}

}
