import java.util.ArrayList;
import java.util.Scanner;


public class Usuarios {
	CriarConta lista;
	public ArrayList <CriarConta> contas= new ArrayList<CriarConta>();
	
	public void addMembro(CriarConta conta){
		contas.add(conta);
	}
	
	public void listar(){
			for(int i=0;i<contas.size();i++){
			lista=contas.get(i);
			System.out.println(lista.getLogin());
		}
	}
	
	public int sizeLista(){
		return contas.size();	
	}


}
