package entidade;

public class PedidoItensEntidade {
	
	private Integer quantidade;
	private Double valor;
	private PedidoProdutoEntidade produto;
		
	public PedidoItensEntidade
	(String nome, Double preco, Integer quantidade) {
		produto = new PedidoProdutoEntidade(nome, preco);
		this.quantidade = quantidade;
	}
	
	public Double subTotal() {
		valor = 0.00;
		return valor += produto.getPreco() * quantidade;	
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public PedidoProdutoEntidade getProduto() {
		return produto;
	}

	public void setProduto(PedidoProdutoEntidade produto) {
		this.produto = produto;
	}
	
	
	

}
