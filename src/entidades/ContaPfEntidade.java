package entidades;

public final class ContaPfEntidade extends ContaEntidade{

	private boolean cartaocredito;
	
	public ContaPfEntidade() {
		super();
	}
	
	public ContaPfEntidade(String correntista, Integer agencia, Integer numeroConta, Double saldo, Double limiteSaque, boolean cartaocredito) {
		super(correntista, agencia, numeroConta, saldo, limiteSaque);
		this.cartaocredito = cartaocredito;
	}
		
	@Override 
	public final void saque (double valor) {
		super.saque(valor);
		saldo -= 3.00;
	}

	public Boolean getCartaocredito() {
		return cartaocredito;
	}

	public void setCartaocredito(boolean cartaocredito) {
		this.cartaocredito = cartaocredito;
	}
	
	@Override
	public String toString() {
		String sn;
		if (getCartaocredito() == true) {
			sn = "Sim";		
		}
		else {
			sn = "Não";
		}
		return super.toString() 
				+ "\nCartão de crédito liberado: " + sn;
				
	}


}
