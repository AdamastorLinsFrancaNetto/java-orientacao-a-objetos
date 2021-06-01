package entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidade.enumeracao.PedidoEnumeracao;

public class PedidoEntidade {
	
	private Date momento;
	private PedidoEnumeracao situacao;
	private PedidoClienteEntidade cliente;
	private PedidoItensEntidade item;
	
	SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	List<PedidoItensEntidade> itens = new ArrayList<>();
	
	public PedidoEntidade
	(String nome, String email, Date aniversario, 
			Date momento, PedidoEnumeracao situacao) {
		cliente = new PedidoClienteEntidade(nome, email, aniversario);
		this.momento = momento;
		this.situacao = situacao;
	}
	
	public Double total() {
		Double total = 0.00;
		for(PedidoItensEntidade item : itens) {
			total += item.subTotal();
		}
		return total;
	}

	public void adicionarItem (PedidoItensEntidade item) {
		itens.add(item);
	}
	
	public void removerItem (PedidoItensEntidade item) {
		itens.remove(item);
	}
	
	public String toString() {
		return "\nRESUMO DO PEDIDO:"
				+ "\nMomento do pedido: " + dataFormato.format(momento)
				+ "\nSituação: " + situacao
				+ "\nCliente: " +  cliente.getNome()
				+ "\nAniversário: " + cliente.getAniversario()
				+ "\nEmail: " + cliente.getEmail()
				+ "\n"
				+ item.toString();
				
	}
	
}
