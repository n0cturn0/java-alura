
public class ControleBonificacao {
	private double soma;
	
//	public void registra(Gerente gerente) {
//		double bonificacao = gerente.getBonificacao();
//		this.soma = this.soma + bonificacao;
//	}
//	
	public void registra(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
	
//	public void registra(EditorVideo editor) {
//		double bonificacao = editor.getBonificacao();
//		this.soma = this.soma + bonificacao;
//	}
	
	public double getSoma() {
		return soma;
	}
}
