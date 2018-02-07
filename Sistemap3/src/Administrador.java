
public class Administrador {

	private String[] usuario= new String[10];
	private String[] identificacao = new String[10];
	private String[] dataini= new String[10];
	private String[] datafin = new String[10];
	private String[] horaini= new String[10];
	private String[] horafin = new String[10];
	private String[] respon= new String[10];
	public Administrador(String[] usuario, String[] identificacao, String[] dataini, String[] datafin, String[] horaini,
			String[] horafin, String[] respon) {

		this.usuario = usuario;
		this.identificacao = identificacao;
		this.dataini = dataini;
		this.datafin = datafin;
		this.horaini = horaini;
		this.horafin = horafin;
		this.respon = respon;
	}
	public void print() {
		for(int i =0 ; i<10;i++) {
		System.out.println("Usuário \n"
				+ "Solicitou \n"
				+ "Data inicial:\n"
				+ "Hora Inicial:\nData de termino:\nHora de termino:\nResponsavel\n"+usuario[i]+identificacao[i]+
				dataini[i]+horaini[i]+datafin[i]+horafin[i]+respon[i]);
		}


	}

}
