package entidades;

public abstract class CarroEntidade {
	
	private String modelo;
	final Double VELOCIDADE_MAXIMA;
	protected Double aceleracao;
	protected Double frenagem;
	protected Double velocidadeAtual = 0.0;
	
	public CarroEntidade(String modelo, double aceleracao, double frenagem, double velocidadeMaxima){
		this.modelo = modelo;
		this.aceleracao = aceleracao;
		this.frenagem = frenagem;
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public abstract void acelerar();
	
	public abstract void frear();
	
	public String toString() {
		return modelo + " - velocidade atual: " + velocidadeAtual + "Km/h";
	}

}
