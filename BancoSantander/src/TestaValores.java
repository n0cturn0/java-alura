
public class TestaValores {
public static void main(String[] args) {
	
	Conta conta = new Conta( 2140, 0101);
//	System.out.println(conta.getTotal());
	
	Conta conta_one = new Conta( 2140, 0102);
//	System.out.println(conta_one.getTotal());
	
	Conta conta_two = new Conta( 2140, 0103);
//	System.out.println(conta_two.getTotal());
	System.out.println("Total de Contas criadas: " +Conta.getTotal());
}
}
