//Gerente eh um Funcionário, Gerente herda da class Funcionario, assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	
		private AutenticacaoUtil autenticador;

		public Gerente() {
			this.autenticador = new AutenticacaoUtil();
		}
	
	
	
		//Reescrita de método, mesmo nome, mesma assinatura, mesma visibilidade, parâmetros
	public double getBonificacao() {
		System.out.println("Chamando o método de Bonificacao na Classe Gerente!");
		//return this.salario;
		// super eleva na hierarquia, das classe, o atributo pe da classe mãe
		return  super.getSalario();
	}


	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		}

	@Override
	public boolean autentica(int senha) {
			boolean autenticou = this.autenticador.autentica(senha);
			return autenticou;
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
