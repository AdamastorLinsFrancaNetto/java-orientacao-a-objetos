package entidade;

public abstract class RestauranteEntidade {
	
	private String nomeComida;
	private Double pesoComida;
	
	public RestauranteEntidade(String nome, Double pesoComida) {
		this.nomeComida = nome;
		this.pesoComida = pesoComida;
	}
	
	public String getNome() {
		return nomeComida;
	}
	public void setNome(String nome) {
		this.nomeComida = nome;
	}
	public Double getPesoComida() {
		return pesoComida;
	}
	public void setPesoComida(Double pesoComida) {
		this.pesoComida = pesoComida;
	}

}
