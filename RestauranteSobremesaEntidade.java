package entidade;

public class RestauranteSobremesaEntidade extends RestauranteEntidade {

	private Double precoKg = 30.0;
	
	public RestauranteSobremesaEntidade(String nome, Double pesoComida) {
		super(nome, pesoComida);
	}

	public Double getPrecoKg() {
		return precoKg;
	}

	public void setPrecoKg(Double precoKg) {
		this.precoKg = precoKg;
	}

}
