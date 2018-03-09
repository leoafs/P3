import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	
	public static void main(String[] args) {
		int opcao;
		int i=0;
		CriarConta lista;
		ArrayList <CriarConta> contas= new ArrayList<CriarConta>();
		Scanner in = new Scanner(System.in);
		Usuarios novo = new Usuarios();
		
		while(true){
			System.out.println("1-Login\n2-Cadastro\n3 Listar(teste)");
			opcao=in.nextInt();
			
			if(opcao==1){
				Perfil perfil = new Perfil();
				perfil.verificar(novo);
				
			}
			else if(opcao==3){
				novo.listar();
				
			}
			else{
				CriarConta cadastro= new CriarConta();
				cadastro.perfil(opcao);
				novo.addMembro(cadastro);
			}
			
	
		}
	}

}
