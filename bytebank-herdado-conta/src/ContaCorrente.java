public class ContaCorrente extends Conta {

        public ContaCorrente(int agencia, int numero) {
            super(agencia,numero); //Implícito
        }
        @Override
        public boolean saca(double valor) {
        double ValorASacar = valor + 0.2;
        return super.saca(ValorASacar);
        }
		@Override
		public void deposita(double valor) {
			super.saldo += super.saldo;
			
		}
}