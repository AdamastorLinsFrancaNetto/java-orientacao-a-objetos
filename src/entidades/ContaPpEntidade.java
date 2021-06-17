package entidades;

public final class ContaPpEntidade extends ContaEntidade{
	
	private Double taxaDeJuros;

	public ContaPpEntidade() {
		super();
	}
	
	public ContaPpEntidade(String correntista, Integer agencia, Integer numeroConta, Double saldo, Double limiteSaque, Double taxaDeJuros) {
		super(correntista, agencia, numeroConta, saldo, limiteSaque);
		this.taxaDeJuros = taxaDeJuros;
	}
	
	@Override 
	public final void saque (double valor) {
		super.saque(valor);
		saldo -= 1.00;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * taxaDeJuros;
	}

	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ "\nTaxa de juros: " + String.format("%.2f", getTaxaDeJuros());
	}

}
