package entidades;

public final class PagamentoFuncionarioTerceirizadoEntidade extends PagamentoFuncionarioEntidade{

	private Double despesasAdicionais;

	public PagamentoFuncionarioTerceirizadoEntidade
	(String nome, Integer horas, Double valorPorHora, Double despesasAdicionais) {
		super(nome, horas, valorPorHora);
		this.despesasAdicionais = despesasAdicionais;
	}
	
	@Override
	public final double remuneracao() {
		return super.remuneracao() + despesasAdicionais * 1.10;
	}

}
