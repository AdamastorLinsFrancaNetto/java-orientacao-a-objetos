package entidade;

import entidade.enumeracao.FormaEnumeracao;

public class FormaRetanguloEntidade extends FormaEntidade {

	private Double largura;
	private Double altura;
	
	public FormaRetanguloEntidade() {
		super();
	}
	
	public FormaRetanguloEntidade(FormaEnumeracao cor, Double largura, Double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	@Override
	public double area() {
		return altura * largura;
	}
	
	@Override
	public String toString () {
		return "\nRet‚ngulo"
				+ "\nCor: " + this.getCor()
				+ "\nAltura: " + this.getAltura()
				+ "\nLargura: " + this.getLargura()
				+ "\n¡REA: " + String.format("%.2f", this.area());
	}
}
