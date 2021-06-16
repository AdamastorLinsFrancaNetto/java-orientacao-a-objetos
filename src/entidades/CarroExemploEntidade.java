package entidade;

public class CarroExemploEntidade extends CarroEntidade {

	public CarroExemploEntidade(String modelo, double aceleracao, double frenagem, double velocidadeMaxima) {
		super(modelo, aceleracao, frenagem, velocidadeMaxima);
	}

	@Override
	public void acelerar() {
		if (velocidadeAtual < VELOCIDADE_MAXIMA) {
			velocidadeAtual += aceleracao;
		} else {
			velocidadeAtual += 0.0;
		}	
	}

	@Override
	public void frear() {
		if (velocidadeAtual >= frenagem) {
			velocidadeAtual -= frenagem;
		} else {
			velocidadeAtual = 0.0;
		}
	}
}
