
public class TesteReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente ngerente = new Gerente();
		ngerente.setNome("Pedro josé");
		String nome = ngerente.getNome();
		ngerente.setSalario(5000.0);
		
		
		//Controle de  bonificação Gerente
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(ngerente);
		
		//Controle de bonificacao Funcionário
//		Funcionario funcionario = new Funcionario();
//		funcionario.setSalario(2000.0);
//		controle.registra(funcionario);
		
		//Controle de bonificação Editor de Video
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		controle.registra(ev);
		
		
		//Printa
//		System.out.println("Nome: " + nome);
		System.out.println("Resultado da soma: " + controle.getSoma());
		
		

	}

}
