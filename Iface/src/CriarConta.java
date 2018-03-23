import java.util.Scanner;

public class CriarConta {

	private String login;
	private String senha;
	private String nome;
	Scanner in = new Scanner(System.in);
	public void perfil(){
		String login;
		String senha;
		String nome;
	
			System.out.println("login:");
			login=in.nextLine();
			System.out.println("Senha:");
			senha=in.nextLine();
			System.out.println("Nome:");
			nome=in.nextLine();
			this.login = login;
			this.senha=senha;
			this.nome=nome;	
		
		
	}
	public String getSenha(){
		
		return  this.senha;
	}
	public String getLogin(){
		
		return  this.login;
	}
	public String getNome(){
		
		return  this.nome;
	}

}
