package entidade;

import java.util.ArrayList;
import java.util.List;

public class ClienteEntidade {
	
	final String nomeCliente;
	final List<ClienteCompraEntidade> listaDeCompras = new ArrayList<>();
	
	ClienteEntidade(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	double obterValorTotalCompras() {
		double total = 0;
		for (ClienteCompraEntidade compras : listaDeCompras) {
			total += compras.obterValorTotalItens();
		}
		return total;
	}
	

}
