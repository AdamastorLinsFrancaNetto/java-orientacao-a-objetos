package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidade.PedidoClienteEntidade;
import entidade.PedidoEntidade;
import entidade.enumeracao.PedidoEnumeracao;

public class PedidoAplicacao {
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Aniversário (DD/MM/AAAA): ");
		Date aniversario = dataFormato.parse(sc.nextLine());
		
		System.out.println("\nInforme os dados do pedido:");
		//momento
		System.out.print("Situação: ");
		String situacao = sc.nextLine(); //enumerado
		
		PedidoEntidade pedido1 = new PedidoEntidade
				(nome, email, aniversario, null, null);
		
		
		
		
		System.out.println(pedido1);
		
	}

}
