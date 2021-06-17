package entidades;

import entidades.enumeracoes.FormaEnumeracao;

public abstract class FormaEntidade {
	
	private FormaEnumeracao cor;

	public FormaEntidade() {
	}
	
	public FormaEntidade(FormaEnumeracao cor) {
		this.cor = cor;
	}

	public FormaEnumeracao getCor() {
		return cor;
	}

	public void setCor(FormaEnumeracao cor) {
		this.cor = cor;
	}
	
	public abstract double area();
	public abstract String toString();
	
}
