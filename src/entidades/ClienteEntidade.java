package entidade;

import java.util.ArrayList;
import java.util.List;

public class ClienteEntidade {
	
	final String nomeCliente;
	final List<ClienteCompraEntidade> listaDeCompras = new ArrayList<>();
	
	public ClienteEntidade(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void adicionarCompras(ClienteCompraEntidade compras) {
		this.listaDeCompras.add(compras);
	}
	
	public double obterValorTotalCompras() {
		double total = 0;
		for (ClienteCompraEntidade compras : listaDeCompras) {
			total += compras.obterValorTotalItens();
		}
		return total;
	}
	
	public void mostrarListDeCompras() {
		int count = 1;
		for (ClienteCompraEntidade compras : listaDeCompras) {	
			System.out.println("\n\nCOMPRA " + count);
			compras.mostrarListaDeItens();
			System.out.printf("\nSubtotal da compra %d: %.2f", count, compras.obterValorTotalItens());
			count++;
		}
	}
	

}
