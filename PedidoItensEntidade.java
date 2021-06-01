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
		return valor += produto.getPreco() * quantidade;	
	}
	
	public String toString() {
		return "Itens do pedido:"
				+ "\nProduto: " + produto.getNome()
				+ "\nPreço: R$ " + produto.getPreco()
				+ "\nQuantidade: " + quantidade
				+ "SUBTOTAL: R$ " + this.subTotal();
	}

}
