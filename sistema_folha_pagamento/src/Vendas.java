
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Vendas {
	
	private double valor;
	private int data;
	public void lista(ArrayList lista,int id,String nome,double valor,int data) {
		int a;
		int aux;
		int b;
		Date data1=new Date();
		Empregado func;
		func=(Empregado) lista.get(id);
		a=data1.getDate();
		data1.setDate(a);
		aux=data1.getDay();
		for(int i =0; i<6;i++){
			if(aux==5){
				b=i+a;
				break;
			}
			
		}
		if(func.getTipo().equals("Comissionados")){
			
				if(a!=a+7 || a!=a+21){
					func.setsalariofin(func.getSalario()+(10/100)*valor);
				}
		}
		
		
		
	}
	
}