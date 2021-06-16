package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.PagamentoFuncionarioEntidade;
import entidade.PagamentoFuncionarioTerceirizadoEntidade;

public class PagamentoAplicacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		List<PagamentoFuncionarioEntidade> funcionarios = new ArrayList<>();
		
		System.out.println("PAGAMENTOS:");
		System.out.print("\nInforme número de funcionários: ");
		int qntFuncionarios = sc.nextInt();
		
		for(int i = 1; i <= qntFuncionarios; i++) {
			System.out.println("\nInforme os dados do funcionário #" + i);
			System.out.print("É terceirizado (s/n)? ");
			String sn = sc.next();
			System.out.print("Nome: ");sc.next();
			String nomeFuncinario = sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: R$ ");
			double valorPorHora = sc.nextDouble();
			if (sn.equalsIgnoreCase("s")) {
				System.out.print("Custo adicional: R$ ");
				double custoAdicional = sc.nextDouble();	
				funcionarios.add(new PagamentoFuncionarioTerceirizadoEntidade
					(nomeFuncinario, horas, valorPorHora, custoAdicional));
			} else {
				funcionarios.add(new PagamentoFuncionarioEntidade
					(nomeFuncinario, horas, valorPorHora));
			}
		}
		System.out.println("\nVALORES À PAGAR:");
		for(PagamentoFuncionarioEntidade f : funcionarios) {
			System.out.printf("%nFuncionário: %s%n"
					+ "Remuneração: R$ %.2f%n", f.getNome(), f.remuneracao());
		}
	
		sc.close();
	}
	
}
