package entidade;

public class ClienteItemEntidade {
	
	final ClienteProdutoEntidade produto;
	final int quantidade;
	
	public ClienteItemEntidade(ClienteProdutoEntidade produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	
}
