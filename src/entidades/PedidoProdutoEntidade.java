package entidades;

public class PedidoProdutoEntidade {
	
	private String nome;
	private Double preco;
	
	public PedidoProdutoEntidade(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Double getPreco () {
		return preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
}
