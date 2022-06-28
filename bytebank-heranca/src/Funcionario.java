//Não pode instanciar dessa classe, pq é abstrata
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario; //Protected : público para os métodos e atributos filhos
	
//	public double getBonificacao() {
//		return this.salario * 0.1;
//	}
	
	//Método sem corpo; Não há implementação
	public abstract double getBonificacao();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
