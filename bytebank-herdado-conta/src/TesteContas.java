
public class TesteContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente conta = new ContaCorrente(111, 011);
		conta.deposita(100.0);
		ContaPoupanca cp = new ContaPoupanca(200, 222);
		cp.deposita(200.0);
		
		conta.transfere(10.0, cp);
		System.out.println("Saldo do conta :" + conta.getSaldo());
		System.out.println("Saldo do CP :" + cp.getSaldo());


	}

}


//Nessa aula, vimos:
//
//Conceitos de herança, construtores e polimorfismo
//A utilização da anotação @Override
//Construtores não são herdados
//Um construtor da classe mãe pode ser chamado através do super()