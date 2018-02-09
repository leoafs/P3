import java.util.ArrayList;
import java.util.Scanner;


public class Sistema {

	
	public static void main(String[] args) {
	
		
		ArrayList <Empregado> lista = new ArrayList<Empregado>();
		
		
		int comando;
		String nome;
		String endereco;
		String tipo;
		String salario;
		int a=1;
		int k=0;
		int j;
		
		
		Scanner in = new Scanner(System.in);
		while(a==1){
		System.out.println("\nAdcionar funcionario - 1\nRemover funcionario - 2\nLista de funcionarios - 3");
		comando = in.nextInt();
		
		
		if (comando==1){
			Empregado funcionario = new Empregado();
			in.nextLine();
			System.out.printf("Nome: ");
			nome = in.nextLine();
			System.out.printf("\nEndereco: ");
			endereco = in.nextLine();
			System.out.printf("\nTipo de trabalho: ");
			tipo = in.nextLine();
			System.out.printf("\nTipo de Salario: ");
			salario = in.nextLine();
			System.out.println(" ");
			funcionario.dados(nome, endereco, tipo, salario,k);
			lista.add(funcionario);
			k++;
		}
		else if(comando==2){
			System.out.println("Id do usuário a ser Removido:");
			j=in.nextInt();
			lista.remove(j);
		}
		else if(comando == 3){
			System.out.println("Empregados");
			for(int i=0;i<lista.size();i++){
				Empregado aux=lista.get(i);
				System.out.println("Id do usuário: "+ aux.getid());
				System.out.println(aux.getNome());
				System.out.println(aux.getEndereco());
				System.out.println(aux.getTipo());
				System.out.println(aux.getSalario());
				System.out.println(" ");
			}
			
			
		}
	
	}
	}
}
