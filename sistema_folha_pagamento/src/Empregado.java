
public class Empregado {
	private String nome;
	private String endereco;
	private String tipo;
	private double salario;
	private String sindi;
	private int id;
	private int horaini;
	private int horafin;
	private double salariofin;
	private String forma;
	
	public void dados(String nome,String endereco,String tipo,double salario,int id,String sindi)
	{
		this.nome=nome;
		this.endereco=endereco;
		this.tipo=tipo;
		this.salario=salario;
		this.id=id;
		this.sindi=sindi;
	}
	public String getNome(){
		return nome;
	}
	public String getEndereco(){
		return endereco;
	}
	public String getTipo(){
		return tipo;
	}
	public double getSalario(){
		return salario;
	}
	public int getid(){
		return id;
	}
	public String getSind(){
		return sindi;
	}
	public String getForma(){
		return this.forma;
	}
	public String get(){
		return forma;
	}
	public void setHoraini(int horas) {
		this.horaini=horas;
	}
	public void setHorafin(int horas) {
		this.horafin=horas;
	}
	public void setsalariofin(double salario) {
		this.salariofin+=salario;
	}
	public double getsalariofin() {
		return salariofin;
	}
	public void setzero() {
		this.salariofin=0;
	}
	
	public int fatorH() {
		if(horafin-horaini>0) {
			return (horafin-horaini);
		}
		else return 0;
	}
	

}
