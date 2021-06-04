package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import entidade.PedidoEntidade;
import entidade.PedidoItensEntidade;
import entidade.enumeracao.PedidoEnumeracao;

public class PedidoAplicacao {
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dataAniversario = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter dataMomento = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Informe os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Aniversário (DD/MM/AAAA): ");
		Date aniversario = dataAniversario.parse(sc.nextLine());
		
		System.out.println("\nInforme os dados do pedido:");
		String data = dataMomento.format(LocalDateTime.now());
		System.out.print("Situação: ");
		PedidoEnumeracao situacao = PedidoEnumeracao.valueOf(sc.nextLine());
		
		PedidoEntidade pedido1 = new PedidoEntidade
				(nome, email, aniversario, data, situacao);
		
		System.out.print("Quantos itens terá o pedido? ");
		int quantidade = sc.nextInt();
		for(int i = 1; i <= quantidade; i++) {
			System.out.println("\nInforme os dados do item #" + i + ":");
			System.out.print("Produto: ");
			String nomeProduto = sc.next();
			System.out.print("Preço: R$ ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidadeItem = sc.nextInt();
			
			PedidoItensEntidade item = new PedidoItensEntidade
					(nomeProduto, preco, quantidadeItem);
			pedido1.adicionarItem(item);
		}

		System.out.println(pedido1);
		sc.close();
	}

}
