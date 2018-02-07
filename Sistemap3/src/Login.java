
public class Login {
	
	private String login;
	private String password;
	public String professor []= {"Juca","Pedro"};
	public String Senhaprofessor []= {"12345","54321"};
	public String pesquisador []= {"Jubileu"};
	public String Senhapesquisador []= {"12435"};
	public String aluno []= {"monstro","fera"};
	public String Senhaaluno []= {"12345","54321"};
	public String adm []= {"supremo"};
	public String Senhaadm []= {"039615"};
	
	public Login(String login, String password) {
		
		this.login = login;
		this.password = password;
	}
	
	String Verificando() {
		
		for(int i=0;i<professor.length;i++) {
			
			if(professor[i] == login && Senhaprofessor[i] == password) {
				
				return "professor";
			}
		}
		
		for(int i=0;i<pesquisador.length;i++) {
			
			if(pesquisador[i] == login && Senhapesquisador[i] == password) {
				
				return "Pesquisador";
			}
		}
		
		for(int i=0;i<aluno.length;i++) {
			
			if(aluno[i] == login && Senhaaluno[i] == password) {
				
				return "Aluno";
			}
		}
		for(int i=0;i<adm.length;i++) {
			
			if(adm[i] == login && Senhaadm[i] == password) {
				
				return "Administrador";
			}
		}
		
		return "Acesso Negado";
	
	}
	
	
	
	
	
}
