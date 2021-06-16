package entidade;

public final class ContaPjEntidade extends ContaEntidade {
	
	private Double limiteEmprestimo;

	public ContaPjEntidade() {
		super();
	}
	
	public ContaPjEntidade
	(String correntista, Double saldo, Integer agencia, Double limiteSaque, Double limiteEmprestimo) {
		super(correntista, saldo, agencia, limiteSaque);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo (double valor) {
		if (valor <= limiteEmprestimo) {
			saldo += valor - 10.00;
		}
	}
	
	@Override 
	public final void saque (double valor) {
		super.saque(valor);
		saldo -= 5.00;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ "\nLimite de empréstimo: R$ " + getLimiteEmprestimo();
	}
	
}
