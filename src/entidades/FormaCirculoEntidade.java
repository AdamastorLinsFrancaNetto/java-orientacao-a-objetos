package entidade;

import entidade.enumeracoes.FormaEnumeracao;

public class FormaCirculoEntidade extends FormaEntidade{
	
	private Double raio;

	public FormaCirculoEntidade() {
		super();
	}
	
	public FormaCirculoEntidade(FormaEnumeracao cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	@Override
	public String toString() {
		return "\nCÌrculo"
				+ "\nCor: " + this.getCor()
				+ "\nRaio: " + this.getRaio()
				+ "\n¡REA: " + String.format("%.2f", this.area());				
	}
}

