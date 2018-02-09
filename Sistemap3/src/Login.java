
public class Login {
	
	private int login;
	
	
	
	public void login(int login) {
		
		this.login = login;
		
	}
	
	String Verificando() {
		
			if(login== 1235) {
				
				return "professor";
			}
		
			
			if(login ==1234) {
				
				return "Pesquisador";
			}
		
		
		
			
			if(login==1321) {
				
				return "Aluno";
			
			}
			
			if(login==1312) {
				
				return "Administrador";
			}
		
		
		return "Acesso Negado";
	
	}
	
	
	
	
	
}
