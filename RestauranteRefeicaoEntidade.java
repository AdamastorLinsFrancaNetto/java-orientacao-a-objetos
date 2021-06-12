package entidade;

public class RestauranteRefeicaoEntidade extends RestauranteEntidade{

	private Double precoKg = 20.0;
	
	public RestauranteRefeicaoEntidade(String nome, Double pesoComida) {
		super(nome, pesoComida);
	}

	public Double getPrecoKg() {
		return precoKg;
	}

	public void setPrecoKg(Double precoKg) {
		this.precoKg = precoKg;
	}

}
