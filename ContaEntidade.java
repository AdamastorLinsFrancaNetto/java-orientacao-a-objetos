package entidade;

import entidade.excecoes.ContaExcecao;

public abstract class ContaEntidade {
	
	protected Double saldo;
	private String correntista;
	private Integer agencia;
	private Double limiteSaque;
	private Boolean liberacaoSaque = false;
	
	public ContaEntidade() {
	}
	
	public ContaEntidade(String correntista, Double saldo, Integer agencia, Double limiteSaque) {
		this.correntista = correntista;
		this.saldo = saldo;
		this.agencia = agencia;
		this.limiteSaque = limiteSaque;
	}
	
	public void saque (double valor) {
		verificacaoSaque(valor);
		liberacaoSaque = true;
		saldo -= valor;
	}
	
	public void verificacaoSaque (double valor) {
		if (valor > limiteSaque) {
			throw new ContaExcecao("A quantia excede o limite de saque!");
		} if (valor > saldo) {
			throw new ContaExcecao("Saldo insuficiente!");
		}
	}
	
	public boolean getLiberacaoSaque() {
		return liberacaoSaque;
	}
	
	public void setLiberacaoSaque(boolean liberacao) {
		this.liberacaoSaque = liberacao;
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
