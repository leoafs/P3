
public class Usuario {
	private String[] usuario= new String[10];
	private String[] identificacao = new String[10];
	private String[] dataini= new String[10];
	private String[] datafin = new String[10];
	private String[] horaini= new String[10];
	private String[] horafin = new String[10];
	private String[] respon= new String[10];
	public int[] vetor = {0,0,0,0,0,0,0,0,0,0};
	public int j=0;
	
	public void Armazenar(Recurso obj,int k) {
		j+=k;
		this.usuario[j] = obj.get_usuario();
		this.identificacao[j] = obj.get_ident();
		this.dataini[j] = obj.get_dataini();
		this.datafin[j] = obj.get_datafin();
		this.horaini[j] = obj.get_horaini();
		this.horafin[j] = obj.get_horafin();
		this.respon[j] = obj.get_respon();
		
	}
	public void status(int comando,int i) {
		if(comando==1) vetor[i]=1;
		else if(comando==2)vetor[i]=2;
		
	}
	public void resultStatus(int i) {
		for(int j=0;j<i;j++) {
			if (vetor[j]==1) System.out.println("Recurso"+j+"aprovado");
			else if(vetor[j]==2) System.out.println("Recurso"+j+"negado");
		}
	}
	
	public void print() {
		System.out.println();
		for(int i =0 ; i<=j;i++) {
		System.out.println("Você Solicitou:"+identificacao[i]+ "\nData inicial:"+dataini[i]+ 
				"\nHora Inicial:"+horaini[i]+ "\nData de termino:"+datafin[i]+ 
				"\nHora de termino:"+horafin[i]+ "\nResponsavel:"+respon[i]+"\n");
				
		}


	}

}
