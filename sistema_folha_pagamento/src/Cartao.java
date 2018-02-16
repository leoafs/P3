import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
public class Cartao {

	public void cartao(ArrayList lista,int id,String nome, String situ,int hora){
		Empregado aux;
		aux = (Empregado) lista.get(id);
		if(nome.equals(aux.getNome())) {
			if(situ.equals("Entrada")) {
				aux.setHoraini(hora);
			}
			else {
				aux.setHorafin(hora);
				aux.setsalariofin(aux.getSalario()*aux.fatorH());

			}
		}
		else System.out.println("Negado");
		
		
	}

}
