package entidades;

public class ContribuentePjEntidade extends ContribuenteEntidade{
	
	private Integer numeroFuncionarios;

	public ContribuentePjEntidade() {
		super();
	}
	
	public ContribuentePjEntidade(String nome, double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double calcImposto() {
		double imposto = (numeroFuncionarios < 10) 
				? rendaAnual * 0.16 : rendaAnual * 0.14;
		return imposto;
	}

}
