import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Pagamento {
	Calendar calendar = Calendar.getInstance();
	Calendar c = Calendar.getInstance();
	Date data=new Date();
	public Pagamento(ArrayList lista,int day){
		int d;
		int a;
		int aux;
		int aux2;
		int aux3;
		Empregado func;
		

		a=data.getDate();
		data.setDate(a);
		aux=data.getDay();
		
		for(int i=0;i<lista.size();i++) {
			func=(Empregado) lista.get(i);
			if(func.getTipo().equals("Fixo")) {
				d=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
				data.setDate(d);
				aux2=data.getDay();

				aux3=aux;
				if(aux2!=0 && aux2!=6) {
					if(d==a || d==day){
					System.out.println(func.getNome()+"\nID:"+func.getid());
						if(func.getSind().equals("Sim")){
							System.out.println(("Salario"+(func.getSalario()+15)));
							System.out.println("Valor do Sindicato - 15R$");
							System.out.println("Salario = "+func.getSalario());
						}
						else{
							System.out.println("Salario = "+func.getSalario());
						}
					}
				}
				else if(aux2==0) {
					if((d-2==aux3 || aux3==day)){
					System.out.println(func.getSalario() + "R$\ndia "+(d-2));
					System.out.println(func.getNome()+"\nID:"+func.getid());
					}
				}
				else if(aux2==6) {
					if((d-1)==aux3 || aux3==day){
					System.out.println(func.getNome()+"\nID:"+func.getid());
					System.out.println(func.getSalario() + "R$\ndia "+(d-1));
					}
				}
			}
			else if(func.getTipo().equals("Horista")){
				
					if(aux==5 ) {
					System.out.println("Valor"+func.getsalariofin());
						func.setzero();
					}
					aux++;
				}
				
			}
		}
}
