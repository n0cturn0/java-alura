
public class Gerente extends Funcionario {
	
	private int senha ;
	
	public void setSenha(int senha)
	{
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	
		//Reescrita de método, mesmo nome, mesma assinatura, mesma visibilidade, parâmetros
	public double getBonificacao() {
		//return this.salario;
		// super eleva na hierarquia, das classe, o atributo pe da classe mãe
		return super.getBonificacao() + super.getSalario();
	}
	
	
	
	
	

	

}
