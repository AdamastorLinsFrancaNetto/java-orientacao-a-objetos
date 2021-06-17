package aplicacao;

import java.util.Scanner;

import entidades.EstoqueEntidade;

public class EstoqueAplicacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados do produto:");
		System.out.print("Nome: ");
		String n = sc.next();
		System.out.print("Preço: ");
		double p = sc.nextDouble();
		System.out.print("Quantidade: ");
		int q = sc.nextInt();
		System.out.println();
		
		EstoqueEntidade produto1 = new EstoqueEntidade(n, p, q);
		
		produto1.mostrarInformacoesEstoque();
		
		System.out.print("Informe a quantidade para adicionar ao estoque: ");
		produto1.adicionarProdutos(sc.nextInt());
		
		System.out.print("Informe a quantidade para remover do estoque: ");
		produto1.removerProdutos(sc.nextInt());
		
		sc.close();
	}
}
