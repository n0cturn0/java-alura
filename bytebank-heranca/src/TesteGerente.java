
public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente n1 = new Gerente();
		
		n1.setNome("Giulian Candeias de Sá");
		n1.setCpf("0000000000");
		n1.setSalario(30000.0);
		System.out.println("-=-=--=-=-=-=-=-=-=--=-=---=--=-=--=--");
		System.out.println("Banco Santander");
		System.out.println(n1.getNome());
		System.out.println(n1.getCpf());
		System.out.println(n1.getSalario());
		n1.setSenha(0101);
		boolean autenticou = n1.autentica(0101);
		System.out.println(autenticou);
		
		System.out.println(n1.getBonificacao());
		
		System.out.println("-=-=--=-=-=-=-=-=-=--=-=---=--=-=--=--");

	}
	
	
	
//		Nessa aula começamos a falar sobre a herança e aprendemos:
//
//		quais problemas a herança pode resolver
//		como usar herança no Java através de palavra chave extends
//		ao herdar, a classe filha ganha todas as características (atributos) e todas as funcionalidades (métodos) da classe mãe
//		conhecemos o primeiro benefício da herança: Reutilização do código
//		Na próxima aula veremos mais detalhes sobre herança como as palavras chaves super, protected e a sobrescrita de métodos!

}
