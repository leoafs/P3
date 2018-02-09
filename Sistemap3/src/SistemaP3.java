import java.util.Scanner;
public class SistemaP3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int encerrar=1;
		int continuar=1;
		int i=0;
		int w=0;
		Administrador admin = new Administrador();
		String verificar;
		Login login = new Login();
		String identificacao;
		String dataini;
		String horaini;
		String datafin;
		String horafin;
		String responsavel;
		int idresponsavel;
		int res=0;
		String email;
		String descri;
		String usuarios;
		Usuario[] user = new Usuario[5];
		user[0] = new Usuario();
		user[1] = new Usuario();
		user[2] = new Usuario();
		user[3] = new Usuario();
		user[4] = new Usuario();


		
		while(encerrar==1){

			System.out.printf("Digite seu ID:");
			int id=in.nextInt();
	
			login.login(id);
			verificar=login.Verificando();
			
			while(continuar==1){
				
				if(verificar=="Administrador") {
					System.out.println("Bem vindo mestre supremo...");
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
						System.out.println("3-Verificar historico de solicitações\n4-Continuar");
						continuar=in.nextInt();
						if(continuar==3)user[(id%10)].print();
						else {
							Recurso recurso = new Recurso();
							in.nextLine();
							System.out.println("Usuário:");
							usuarios = in.nextLine();
							System.out.println("Email:");
							email=in.nextLine();
							System.out.printf("Identificação do recurso:");
							identificacao=in.nextLine();
							System.out.println("Descrição:");
							descri=in.nextLine();
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
							System.out.printf("Id do Responsavel:");
							idresponsavel=in.nextInt();
							
							recurso.identific(identificacao);
							recurso.dataDeInicio(dataini);
							recurso.horaDeInicio(horaini);
							recurso.datafinal(datafin);
							recurso.horafinal(horafin);
							res=recurso.resp(responsavel,idresponsavel);
							if(res==1) {
							while(res==1) {
								
								System.out.println("Responsavel não autorizado. Deseja continuar?\n1-Sim\n2-Não");
								continuar=in.nextInt();
								
								if(continuar==2)break;
								System.out.printf("Responsavel:");
								responsavel=in.nextLine();
								idresponsavel=in.nextInt();
								res=recurso.resp(responsavel,idresponsavel);
								
								
								}
							}
							else {
								
							recurso.email(email);
							recurso.user(usuarios);
							recurso.descri(descri);
							System.out.println(id%10);
							System.out.println("Em processo de alocamento...\n\n");
							admin.Armazenar(recurso, i);
								user[id%10].Armazenar(recurso, w);
							
							w=1;
							i++;
							}
							
						}
						
					}
					
					
				}
					
				
				System.out.println("Deseja Continuar?\n1-Sim\n2-Não\n");
				continuar=in.nextInt();
				

			}
			w=0;
			continuar=1;

		}


	}
}

