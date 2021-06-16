package entidade;

public class PagamentoFuncionarioEntidade {
	
	private String nome;
	private Integer horas;
	private Double valorPorHora;
	
	public PagamentoFuncionarioEntidade(String nome, Integer horas, Double valorPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}
	
	public double remuneracao() {
		return valorPorHora * horas;
	}

	public String getNome() {
		return nome;
	}
	
}
