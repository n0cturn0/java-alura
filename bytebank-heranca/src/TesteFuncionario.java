
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Gerente guto = new Gerente();
		guto.setNome("Guto Oliveira");
		guto.setCpf("000-000-001-45");
		guto.setSalario(1000);
		
		System.out.println(guto.getNome());
		System.out.println(guto.getBonificacao());
	}

}
