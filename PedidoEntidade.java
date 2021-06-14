package entidade;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidade.enumeracoes.PedidoEnumeracao;

public class PedidoEntidade {
	
	private PedidoEnumeracao situacao;
	private PedidoClienteEntidade cliente;
	private String momento;
	
	static SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
	static DateTimeFormatter dataMomento = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	List<PedidoItensEntidade> itens = new ArrayList<>();
	
	public PedidoEntidade
	(String nome, String email, Date aniversario, 
			String momento, PedidoEnumeracao situacao) {
		cliente = new PedidoClienteEntidade(nome, email, aniversario);
		this.momento = momento;
		this.situacao = situacao;
	}
	
	public double total() {
		double total = 0;
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
		StringBuilder sb = new StringBuilder();
		sb.append("\nRESUMO DO PEDIDO:");
		sb.append("\nMomento do pedido: " + momento);
		sb.append("\nSituação: " + situacao);
		sb.append("\nCliente: " +  cliente.getNome());
		sb.append("\nAniversário: " + dataFormato.format(cliente.getAniversario()));
		sb.append("\nEmail: " + cliente.getEmail());
		sb.append("\n");
		sb.append("\nItens do pedido:");
		int count = 1;
		for (PedidoItensEntidade i : itens) {
			sb.append("\nItem #" + count);
			sb.append("\nProduto: " + i.getProduto().getNome());
			sb.append("\nPreço: R$ ");
			sb.append(String.format("%.2f", i.getProduto().getPreco()));
			sb.append("\nQuantidade: " + i.getQuantidade());
			sb.append("\nSubtotal: R$ ");
			sb.append(String.format("%.2f", i.subTotal()));
			count++;
		}
		sb.append("\n\nTOTAL: R$ ");
		sb.append(String.format("%.2f", this.total()));
		return sb.toString();
	}
	
}
