import java.util.Scanner;
public class Logado {
	public int sair=1;
	private Scanner in = new Scanner(System.in);
	int opcao;
	public void opcoes(Usuarios user,int i){
		CriarConta usuario = user.contas.get(i);
		System.out.println("Bem vindo "+usuario.getNome());
		
		System.out.println("Adcionar Amigos-1\nRemover Amigos-2\nSair-3");
		opcao=in.nextInt();
		if(opcao==3)this.sair=3;
	}

}
