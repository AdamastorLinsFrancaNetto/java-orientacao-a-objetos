package entidade;

import entidade.excecoes.ContaExcecao;

public abstract class ContaEntidade {
	
	protected Double saldo;
	private String correntista;
	private Integer agencia;
	private Double limiteSaque;
	
	public ContaEntidade() {
	}
	
	public ContaEntidade(String correntista, Double saldo, Integer agencia, Double limiteSaque) {
		this.correntista = correntista;
		this.saldo = saldo;
		this.agencia = agencia;
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
	
	public String toString() {
		return "\nCONTA:"
			+ "\nAgência: " + getAgencia()
			+ "\nCorrentista: " + getCorrentista()
			+ "\nSaldo: R$ " + String.format("%.2f", getSaldo())
			+ "\nLimite de saque: R$ " + String.format("%.2f", getLimiteSaque());
	}

}
