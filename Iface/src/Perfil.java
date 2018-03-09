import java.util.Scanner;

public class Perfil {
	private String login;
	private String senha;
	private Scanner in = new Scanner(System.in);
	
	public Perfil() {
		System.out.println("Digite seu login");
		String login =in.nextLine();
		System.out.println("Digite Sua Senha");
		String senha =in.nextLine();
		this.login = login;
		this.senha = senha;
	}
	public void verificar(Usuarios user){
		Logado online = new Logado();
		CriarConta nome;
		for(int i=0;i<user.sizeLista();i++){
		nome=user.contas.get(i);
		if(nome.getLogin().equals(login) && nome.getSenha().equals(senha)){
			while(online.sair!=3){
			online.opcoes(user,i);
			}
			
		}
		
	}
	}
}
