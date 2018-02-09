import java.util.Scanner;
public class SistemaP3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int encerrar=1;
		int continuar=1;
		int i=0;
		Administrador admin = new Administrador();
		String verificar;
		Login login = new Login();
		String identificacao;
		String dataini;
		String horaini;
		String datafin;
		String horafin;
		String responsavel;
		String email;
		String descri;
		
		while(encerrar==1){

			System.out.printf("Digite seu ID:");
			int id=in.nextInt();
			
			login.login(id);
			verificar=login.Verificando();
			Usuario user = new Usuario();
			
			while(continuar==1){
				
				if(verificar=="Administrador") {
					if(i==0)System.out.println("Sem solicitações");
					else admin.print();
				}
				else {
					if(verificar=="Acesso Negado") {
						System.out.println("Id Invalido");
						break;
					}
					else 
						{
							Recurso recurso = new Recurso();
							
							in.nextLine();
							System.out.printf("Identificação:");
							identificacao=in.nextLine();
							System.out.printf("Data Inicial:");
							dataini=in.nextLine();
							System.out.printf("Hora Inicial:");
							horaini=in.nextLine();
							System.out.printf("Data de término:");
							datafin=in.nextLine();
							System.out.printf("Hóra de término");
							horafin=in.nextLine();
							System.out.printf("Responsavel:");
							responsavel=in.nextLine();
							
							recurso.identific(identificacao);
							recurso.dataDeInicio(dataini);
							recurso.horaDeInicio(horaini);
							recurso.datafinal(datafin);
							recurso.horafinal(horafin);
							recurso.resp(responsavel);
							System.out.println("Em processo de alocamento...\n\n");
							admin.Armazenar(recurso, i);
							user.Armazenar(recurso, i);
							
							i++;
						}
					
				}
				
				
				System.out.println("Deseja continuar?\n1-Sim\n2-Não");
				continuar=in.nextInt();

			}
			continuar=1;

		}


	}
}

