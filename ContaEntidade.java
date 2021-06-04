package entidade;

public class ContaEntidade {
	
	protected Double saldo;
	private String correntista;
	private Integer agencia;
	
	public ContaEntidade(String correntista, Double saldo, Integer agencia) {
		this.correntista = correntista;
		this.saldo = saldo;
		this.agencia = agencia;
	}
	
	public void saque (double valor) {
		saldo -= valor + 5.00;
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

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	
	
	
	

}
