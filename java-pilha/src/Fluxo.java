public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        metodo1();
        }  catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
        	System.out.println("ArithmeticException" + msg);
         	ex.printStackTrace();
		}
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
        metodo2();
        }  catch (ArithmeticException e) {
        	String error = e.getMessage();
        	System.out.println("ArithmeticException" + error);
		}
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        throw  new MinhaExcecao("Erro");
        
        //System.out.println("Fim do metodo2");
    }
}