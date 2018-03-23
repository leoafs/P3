import java.util.ArrayList;


public class Amigos extends Usuarios {
	CriarConta usuarios;
	public ArrayList <CriarConta> contas= new ArrayList<CriarConta>();
	
	public void addAmigos(String amigo){
		for(int i= 0; i<super.contas.size();i++){
			usuarios=super.contas.get(i);
			if(usuarios.getNome().equals(amigo)){
				
			}
		}
		
	}

}
