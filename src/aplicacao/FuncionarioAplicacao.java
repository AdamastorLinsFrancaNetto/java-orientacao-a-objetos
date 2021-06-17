package aplicacao;

import java.util.Scanner;

import entidades.FuncionarioEntidade;

public class FuncionarioAplicacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados do funcionário:");
		System.out.print("Nome: ");
		String n = sc.next();
		System.out.print("Salário bruto: ");
		double s = sc.nextDouble();
		System.out.print("Imposto: ");
		double i = sc.nextDouble();
		System.out.println();
		
		FuncionarioEntidade funcinario1 = new FuncionarioEntidade(n, s, i);
		
		System.out.println(funcinario1);
		
		System.out.print("Quantos porcento de aumento: ");
		funcinario1.aumentarSalario(sc.nextDouble());
		
		funcinario1.informacoesFuncionario();
		
		
		sc.close();
	}

}
