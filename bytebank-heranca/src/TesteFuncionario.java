
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario guto = new Funcionario();
		guto.setNome("Guto Oliveira");
		guto.setCpf("000-000-001-45");
		guto.setSalario(1000);
		
		System.out.println(guto.getNome());
		System.out.println(guto.getBonificacao());
	}

}
