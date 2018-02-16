	import java.util.ArrayList;
	import java.util.Scanner;
	
	
	public class Sistema {
		
	public static void main(String[] args) {

		ArrayList <Empregado> lista = new ArrayList<Empregado>();
		ArrayList <Sindicato> lista2= new ArrayList<Sindicato>();
		Cartao ponto = new Cartao();
		
		int comando;
		String nome;
		String endereco;
		String tipo;
		double salario;
		String forma;
		String resposta;
		int a=1;
		int k=0;
		int j;
		int day;
		
		Scanner in = new Scanner(System.in);
		
		while(a==1){
			System.out.println("\nAdcionar funcionario - 1\nRemover funcionario - 2\nLista de funcionarios - 3\nListar Membros do Sindicato - 4\nFolha de Pagamento-5\nPonto - 6" );
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
			System.out.printf("\nSalario: ");
			salario = in.nextDouble();
			System.out.printf("\nForma de Pagamento(Cheque pelos Correios,Conta Bancaria,Cheque em mãos):");
			forma = in.nextLine();
			in.nextLine();
			System.out.println(" ");
			
			System.out.println("Pertence ao Sindicato?\n SIM-s\n NÃO-n");
			resposta = in.nextLine();
			if(resposta.equals("s")) {
				Sindicato membro = new Sindicato();
				funcionario.dados(nome, endereco, tipo, salario-15,k,"Sim");
				membro.membro(nome, endereco, tipo, salario, k+1);
				lista2.add(membro);
			}
			else {
				funcionario.dados(nome, endereco, tipo, salario,k,"Não");
			}
			k++;
			lista.add(funcionario);
		}
		else if(comando==2){
			System.out.printf("Id do usuário a ser Removido:\n");
			j=in.nextInt();
			lista.remove(j);
		}
		else if(comando == 3){
			System.out.println("Empregados");
			for(int i=0;i<lista.size();i++){
				Empregado aux=lista.get(i);
				System.out.printf("\nId do usuário: %s",aux.getid());
				System.out.printf("\nNome: %s",aux.getNome());
				System.out.printf("\nEndereço: %s",aux.getEndereco());
				System.out.printf("\nTipo de trabalho: %s",aux.getTipo());
				System.out.printf("\nSalario: "+aux.getSalario()+"R$");
				System.out.printf("\nForma de Pagammento: " + aux.get());
				System.out.printf("\nPertence ao sindicato?: %s ",aux.getSind());
			}
	   }
		else if(comando==4) {
			System.out.println("Membros");
			for(int i=0;i< lista2.size();i++) {
				Sindicato aux2 = lista2.get(i);
			System.out.println("Id do usuário: "+ aux2.getid());
			System.out.println("Nome: "+aux2.getNome());
			System.out.println("Endereço: "+aux2.getEndereco());
			System.out.println("Tipo de trabalho: "+aux2.getTipo());
			System.out.println("Salario: "+aux2.getSalario()+"R$");
			}
		}
		else if(comando==5) {
			System.out.println("Digite 0 para o dia Atual ou digite uma dia expecifico:");
			day=in.nextInt();
			Pagamento pag= new Pagamento(lista,day);

		}
		else if(comando==6) {
			int iden,ho;
			String name,suta;
			System.out.println("Digite seu ID");
			iden=in.nextInt();
			System.out.println("Digite seu nome");
			in.nextLine();
			name= in.nextLine();
			System.out.println("Entrada/Saida");
			suta=in.nextLine();
			System.out.println("Hora");
			ho=in.nextInt();
			
			ponto.cartao(lista, iden, name, suta, ho);
		}
	
	}

	}

}
