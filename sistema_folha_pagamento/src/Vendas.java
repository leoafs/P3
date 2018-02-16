
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Vendas {
	
	private double valor;
	private int data;
	public void add (ArrayList lista,int id,String nome,double valor,int data) {
		int a;
		int aux;
		int b;
		int sexta2,sexta1,cont=0,menor;
		
		
		Date data1=new Date();
		Empregado func;
		func=(Empregado) lista.get(id);
		Calendar calendar = Calendar.getInstance();
		data1.getDate();
		
		a=calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
		data1.setDate(a);
		if(data1.getDay()==5) {
			sexta1=a+7;
			sexta2=a+21;
		}
		else if(data1.getDay()==6) {
			sexta1=a+6;
			sexta2=a+20;
		}
		else  {
			sexta1=(5-data1.getDay())+a+7;
			sexta2=(5-data1.getDay())+a+21;
		}
		if(data<sexta1 || data>sexta2) {
			func.setSalario1(valor);
		}
		else if(data<sexta2 && data>sexta1) {
			func.setSalario2(valor);
		}
		
		
		
		
	}
	
}