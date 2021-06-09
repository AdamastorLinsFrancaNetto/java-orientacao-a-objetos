package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.ContribuenteEntidade;
import entidades.ContribuentePfEntidade;
import entidades.ContribuentePjEntidade;

public class ContribuienteAplicacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<ContribuenteEntidade> contribuentes = new ArrayList<>();
		
		System.out.print("Informe o número de contribuentes: ");
		int quantidade = sc.nextInt();
		
		for(int i = 1; i <= quantidade; i++) {
			System.out.println("\nDados do contribuente #" + i + ":");
			System.out.print("Físico ou jurídico (f/j): ");
			char fj = sc.next().charAt(0);
			System.out.print("Nome: ");sc.next();
			String nome = sc.nextLine();
			System.out.print("Renda Anual: R$ ");
			double rendaAnual = sc.nextDouble();
			if (fj == 'f') {
				System.out.print("Gastos com saúde: R$ ");
				double gastoSaude = sc.nextDouble();
				contribuentes.add(new ContribuentePfEntidade(nome, rendaAnual, gastoSaude));
			}
			else if (fj == 'j') {
				System.out.print("Número de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				contribuentes.add(new ContribuentePjEntidade(nome, rendaAnual, numeroFuncionarios));
			}
			else {
				System.out.println("Tipo de contribuente inválido!");
			}
		}
		
		System.out.println("\nVALOR DO IMPOSTO:");
		for(ContribuenteEntidade c : contribuentes) {
			System.out.printf("%.9s - Imposto: R$ %.2f%n", c.getNome(), c.calcImposto());	
		}
		
		double soma = 0.00;
		for(ContribuenteEntidade c : contribuentes) {
			soma += c.calcImposto();
		}
		System.out.printf("\nTOTAL DE IMPOSTOS: R$ %.2f", soma );
		
		sc.close();
	}

}
