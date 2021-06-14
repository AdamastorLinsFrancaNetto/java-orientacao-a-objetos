package entidade.excecoes;

public class ContaExcecao extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ContaExcecao(String msg) {
		super(msg);
	}
}
