package aplicacao;

import entidade.ClienteCompraEntidade;
import entidade.ClienteEntidade;

public class ClienteAplicacao {
	
	public static void main(String[] args) {
		
		ClienteEntidade cliente1 = new ClienteEntidade("Adamastor");
		
		ClienteCompraEntidade compra1 = new ClienteCompraEntidade();
		compra1.adicionarItem("Camisa", 99.90, 2);
		compra1.adicionarItem("Calça", 100.10, 2);
		
		ClienteCompraEntidade compra2 = new ClienteCompraEntidade();
		compra2.adicionarItem("Mouse", 100.00, 1);
		compra2.adicionarItem("Teclado", 200.00, 1);
		
		cliente1.adicionarCompras(compra1);
		cliente1.adicionarCompras(compra2);
		
		System.out.printf("O valor total das compras foi: R$ %.2f", cliente1.obterValorTotalCompras());
		cliente1.mostrarListDeCompras();	
	}

}
