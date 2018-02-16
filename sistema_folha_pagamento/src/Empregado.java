
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
	private double salario1;
	private double salario2;
	private int marcador;
	public void dados(String nome,String endereco,String tipo,double salario,int id,String sindi,String forma)
	{
		this.nome=nome;
		this.endereco=endereco;
		this.tipo=tipo;
		this.salario=salario;
		this.id=id;
		this.sindi=sindi;
		this.forma=forma;
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
	public void setSalario1(double valor) {
		
		this.salario1+=(valor+(salario/2));
	}
	public void setSalario2(double valor) {
		this.salario2+=valor+salario/2;
	}
	public void setSalario11(double valor) {
		this.salario1=valor;
	}
	public void setSalario22(double valor) {
		this.salario2=valor;
	}
	public double getSalario1() {
		return salario1;
	}
	public double getSalario2() {
		return salario2;
	}
	public int fatorH() {
		if(horafin-horaini>0) {
			return (horafin-horaini);
		}
		else return 0;
	}
	

}
