
//Contrato Autenticável
//Quem assina esse contrato, precisa implementar
//Metodo setSenha
//Metodo autentica
public  abstract interface Autenticavel  {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
