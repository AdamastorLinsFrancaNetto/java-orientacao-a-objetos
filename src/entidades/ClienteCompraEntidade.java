package entidades;

import java.util.ArrayList;
import java.util.List;

public class ClienteCompraEntidade {
	
	final List<ClienteItemEntidade> listaDeItens = new ArrayList<>();
		
	//public void adicionarItem(ClienteProdutoEntidade prod, int quantidade) {
		//this.listaDeItens.add(new ClienteItemEntidade(prod, quantidade));
	//}
	
	public void adicionarItem(String nomeProduto, double preco, int quantidade) {
		var produto = new ClienteProdutoEntidade(nomeProduto, preco);
		this.listaDeItens.add(new ClienteItemEntidade(produto, quantidade));
	}
	
	public double obterValorTotalItens() {
		double total = 0;
		for (ClienteItemEntidade item : listaDeItens) {
			total += item.quantidade * item.produto.precoProduto;
		}
		return total;
	}
	
	public void mostrarListaDeItens() {
		for(ClienteItemEntidade itens : listaDeItens) {
			System.out.printf("%nProduto: %s%n"
					+ "Preço: %.2f%n"
					+ "Quantidade: %d%n"
					+ "Subtotal do produto: %.2f%n",
					itens.produto.nomeProduto, 
					itens.produto.precoProduto, 
					itens.quantidade, 
					(itens.produto.precoProduto * itens.quantidade));
		}
	}
}
