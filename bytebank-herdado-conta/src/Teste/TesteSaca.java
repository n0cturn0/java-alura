package Teste;
public class TesteSaca {

	public static void main(String[] args) {
		
		modelo.Conta conta = new modelo.ContaCorrente(123, 321);
		conta.deposita(200.0);
		conta.saca(190.0);
		System.out.println(conta.getSaldo());
	}

}
