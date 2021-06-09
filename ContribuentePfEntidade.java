package entidade;

public class ContribuentePfEntidade extends ContribuenteEntidade{
	
	private Double gastoSaude;

	public ContribuentePfEntidade() {
		super();
	}
	
	public ContribuentePfEntidade(String nome, double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public Double calcImposto() {
		double imposto = 0;
		double abatimento = 0;
		if (rendaAnual < 20000) {
			imposto = rendaAnual * 0.15;
		} 
		else {
			imposto = rendaAnual * 0.25;
		}
		if (gastoSaude != null) {
			abatimento = gastoSaude * 0.50;
		}
		return imposto - abatimento;
	}

}
