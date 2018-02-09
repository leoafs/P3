
public class Login {
	
	private int login;

	public void login(int login) {
		
		this.login = login;
		
	}
	
	String Verificando() {
		
			if(login== 12350) {
				
				return "professor";
			}
		
			
			if(login ==12341) {
				
				return "Pesquisador";
			}
			
			if(login==13212) {
				
				return "Aluno";
			
			}
			
			if(login==13123) {
				
				return "Administrador";
			}
		
		
		return "Acesso Negado";
	
	}
}
