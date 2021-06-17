package entidades;

public class TipoProdutoEntidade {

	private String nome;
	private Double preco;

	public TipoProdutoEntidade(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String etiqueta() {
		return "Nome: " + nome + "\nPreço R$: " + String.format("%.2f", preco);
	}

	public double getPreco() {
		return preco;
	}

}
