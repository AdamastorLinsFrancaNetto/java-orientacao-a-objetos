package entidade;

public final class ContaPoupancaEntidade extends ContaEntidade{
	
	private double taxaDeJuros;

	public ContaPoupancaEntidade(String correntista, Double saldo, Integer agencia, double taxaDeJuros) {
		super(correntista, saldo, agencia);
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * taxaDeJuros;
	}
	
	@Override
	public final void saque (double valor) {
		saldo -= valor;
	}

	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	
	
	
}
