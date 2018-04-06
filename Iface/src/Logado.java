import java.util.Scanner;
public class Logado {
	public int sair=1;
	private Scanner in = new Scanner(System.in);
	private int opcao;
	private String nome;
	private String sobrenome;
	public void opcoes(Usuarios user,int i){
		CriarConta usuario = user.contas.get(i);
		CriarConta amigo;
		System.out.println("Bem vindo "+usuario.getNome());
		
		System.out.println("Adcionar Amigos-1\nRemover Amigos-2\nSair-3\nEditar Perfil-4\nMensagens-5");
		opcao=in.nextInt();
		if(opcao==3)this.sair=3;
		else if(opcao==1) {
			System.out.println("O nome:");
			in.nextLine();
			nome=in.nextLine();
			System.out.println("O Sobrenome:");
			sobrenome=in.nextLine();
			for(int j=0;j<user.sizeLista();j++) {
				amigo = user.contas.get(i);
				if(amigo.getNome().equals(nome)) {
					System.out.println("ENROUUUUU1");
					
				}
			}
			
		}
	}
	
}
