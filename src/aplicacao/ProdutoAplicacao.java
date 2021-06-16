package aplicacao;

import java.util.Scanner;

import entidade.ProdutoEntidade;

public class ProdutoAplicacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tamanho do vetor? ");
		int n = sc.nextInt();
		
		ProdutoEntidade[] vetor = new ProdutoEntidade[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("\nNome: ");
			String nome = sc.next();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			vetor[i] = new ProdutoEntidade(nome, preco);
		}
		double total = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(
					"\nNome: " + vetor[i].getNome()
					+ "\nPreço: " + vetor[i].getPreco());
			total += vetor[i].getPreco();
		}
		
		System.out.printf("\nValor total dos produtos: %.2f%n", total);
		System.out.printf("\nA média dos produtos foi: %.2f%n", 
				total / vetor.length);
		
		sc.close();
	}
}
