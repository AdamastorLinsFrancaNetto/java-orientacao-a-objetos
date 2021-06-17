package entidades;

import entidades.excecoes.ContaExcecao;

public abstract class ContaEntidade implements Comparable<ContaEntidade>{
	
	private Integer agencia;
	private Integer numeroConta;
	private String correntista;
	protected Double saldo;
	private Double limiteSaque;
	
	public ContaEntidade() {
	}
	
	public ContaEntidade(String correntista, Integer agencia, Integer numeroConta, Double saldo, Double limiteSaque) {
		this.correntista = correntista;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	
	public void saque (double valor) {
		if (saldo < valor) {
			throw new ContaExcecao("Saldo insuficiente!");
		}
		if (limiteSaque < valor) {
			throw new ContaExcecao("A quantia excede o limite de saque!");
		}
		saldo -= valor;
	}
	
	public void transfere(double valor, ContaEntidade conta) {
		if (saldo < valor) {
			throw new ContaExcecao("Saldo insuficiente!");
		}
		saldo -= valor;
	}
	
	public void deposito (double valor) {
		saldo += valor;
	}
	
	@Override
	public boolean equals(Object outraConta) {
		ContaEntidade conta = (ContaEntidade) outraConta;
		if(this.agencia != conta.agencia) {
			return false;
		}
		if (this.numeroConta != conta.numeroConta) {
			return false;
		}
		return true;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public String getCorrentista() {
		return correntista;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public String informacoesSaldo() {
		return "Saldo atualizado: R$ " + String.format("%.2f", getSaldo());
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	
	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String toString() {
		return "\nCONTA:"
			+ "\nAgência: " + getAgencia()
			+ "\nNº da conta: " + getNumeroConta()
			+ "\nCorrentista: " + getCorrentista()
			+ "\nSaldo: R$ " + String.format("%.2f", getSaldo())
			+ "\nLimite de saque: R$ " + String.format("%.2f", getLimiteSaque());
	}
	
	@Override
	public int compareTo(ContaEntidade outra) {
		return Integer.compare(this.agencia, outra.agencia);
	}

}
