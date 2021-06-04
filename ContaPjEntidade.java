package entidade;

public class ContaPjEntidade extends ContaEntidade {
	
	private Double limiteEmprestimo;

	public ContaPjEntidade
	(String correntista, Double saldo, Integer agencia, Double limiteEmprestimo) {
		super(correntista, saldo, agencia);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo (double valor) {
		if (valor <= limiteEmprestimo) {
			saldo += valor - 10.00;
		}
	}
	
	@Override 
	public final void saque (double valor){
		super.saque(valor);
		saldo -= 2.00;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
}
