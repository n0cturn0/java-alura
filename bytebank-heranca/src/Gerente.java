
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
	
	
	
//	
//			O que aprendemos?
//
//			Nessa aula já entramos mais a fundo na herança. Aprendemos:
//
//			que classe mãe é chamada de super ou base class
//			que a classe filha também é chamada de sub class
//			como aumentar a visibilidade de um membro (atributo, método) através do protected
//			como acessar ou chamar um membro (atributo, método) através do super
//			como redefinir um método através da sobrescrita
//			Na próxima aula veremos um novo benefício da herança, o Polimorfismo. Segura!

	

}
