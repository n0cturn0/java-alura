
public class SistemaInterno {
	
	private int senha = 2222;
	
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou)
		{
			System.out.println("Bem vindo ao sistema");
		} else {
			System.out.println("Você não tem permissão para acessar ao sistema");
		}
	}
	
	
}
