import java.util.Scanner;
public class SistemaP3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int encerrar=1;
		int continuar=1;
		while(encerrar!=1){
			String id=in.nextLine();
			String senha=in.nextLine();
			Login login = new Login(id,senha);
			while(continuar==1){
				System.out.println("Deseja continuar?\n1-Sim\n2-Não");


			}

		}


	}
}

