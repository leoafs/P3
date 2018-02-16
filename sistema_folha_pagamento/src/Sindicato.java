
public class Sindicato {
	private String nome;
	private String endereco;
	private String tipo;
	private double salario;
	private int id;
	public void membro(String nome,String endereco, String tipo, double salario,int id) {
		
		this.nome=nome;
		this.endereco=endereco;
		this.tipo=tipo;
		this.salario=salario;
		this.id=id;
		
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
}
