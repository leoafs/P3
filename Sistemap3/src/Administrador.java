import java.util.Scanner;

public class Administrador {

	private String[] usuario= new String[10];
	private String[] identificacao = new String[10];
	private String[] dataini= new String[10];
	private String[] datafin = new String[10];
	private String[] horaini= new String[10];
	private String[] horafin = new String[10];
	private String[] respon = new String[10];
	public int[] aprovacao = {0,0,0,0,0,0,0,0,0,0};
	public int j=0;
	
	public void Armazenar(Recurso obj,int k) {
		j=k;
		this.usuario[j] = obj.get_usuario();
		this.identificacao[j] = obj.get_ident();
		this.dataini[j] = obj.get_dataini();
		this.datafin[j] = obj.get_datafin();
		this.horaini[j] = obj.get_horaini();
		this.horafin[j] = obj.get_horafin();
		this.respon[j] = obj.get_respon();
		
	}
	
	public void print() {
		int resposta;
		Scanner in = new Scanner(System.in);

 		System.out.println();
		for(int i =0 ; i<=j;i++) {
		System.out.println("Solicitou:"+identificacao[i]+ "\nData inicial:"+dataini[i]+ 
				"\nHora Inicial:"+horaini[i]+ "\nData de termino:"+datafin[i]+ 
				"\nHora de termino:"+horafin[i]+ "\nResponsavel:"+respon[i]);
				if(aprovacao[i]==1)System.out.println("Alocado");
				else if(aprovacao[i]==2)System.out.println("Aloca��o Negada");
				else {
					System.out.println("Aprovar?\n1:sim\n2:N�o");
					aprovacao[i]=in.nextInt();
				}
		}
		


	}

}
