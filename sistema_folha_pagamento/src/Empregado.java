import java.util.ArrayList;


public class Empregado {

	private String nome;
	private String endereco;
	private String tipo;
	private String salario;
	private int id;
	
	public void dados(String nome,String endereco,String tipo,String salario,int id)
	{
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
	public String getSalario(){
		return salario;
	}
	public int getid(){
		return id;
	}

}
