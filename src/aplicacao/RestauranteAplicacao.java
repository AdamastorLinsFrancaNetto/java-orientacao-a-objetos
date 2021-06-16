package aplicacao;

import java.util.Scanner;

import entidade.RestauranteClienteEntidade;
import entidade.RestauranteRefeicaoEntidade;
import entidade.RestauranteSobremesaEntidade;

public class RestauranteAplicacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");sc.next();
		String nome = sc.nextLine();
		RestauranteClienteEntidade c1 = new RestauranteClienteEntidade(nome);
		
		System.out.print("\nQuantos acompanhamentos na refeição: ");
		int quantidade = sc.nextInt();
		for(int i = 1; i <= quantidade; i++) {
			System.out.printf("\n%dº acompanhamento: ", i);sc.next();
			String nomeAcompanhamento = sc.nextLine();
			System.out.print("Peso em gramas: ");
			double peso = sc.nextDouble();
			c1.adicionarRefeicao(new RestauranteRefeicaoEntidade(nomeAcompanhamento, peso));
		}
		
		System.out.print("\nQuantas sobremesas: ");
		quantidade = sc.nextInt();
		for(int i = 1; i <= quantidade; i++) {
			System.out.printf("\n%dª sobremesa: ", i);sc.next();
			String nomeAcompanhamento = sc.nextLine();
			System.out.print("Peso em gramas: ");
			double peso = sc.nextDouble();
			c1.adicionarSobremesa(new RestauranteSobremesaEntidade(nomeAcompanhamento, peso));
		}

		c1.informacoes();
		
		
		sc.close();
	}

}
