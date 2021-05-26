package entidade;

import java.util.ArrayList;
import java.util.List;

public class ClienteCompraEntidade {
	
	final List<ClienteItemEntidade> listaDeItens = new ArrayList<>();
		
	void adicionarItem(ClienteProdutoEntidade prod, int quantidade) {
		this.listaDeItens.add(new ClienteItemEntidade(prod, quantidade));
	}
	
	void adicionarItem(String nomeProduto, double preco, int quantidade) {
		var produto = new ClienteProdutoEntidade(nomeProduto, preco);
		this.listaDeItens.add(new ClienteItemEntidade(produto, quantidade));
	}
	
	double obterValorTotalItens() {
		double total = 0;
		
		for (ClienteItemEntidade item : listaDeItens) {
			total += item.quantidade * item.produto.precoProduto;
		}
		return total;
	}

}
