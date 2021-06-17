package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.AlunoEntidade;

public class AlunoAplicacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<AlunoEntidade> alunos = new ArrayList<AlunoEntidade>();
		
		System.out.print("Quantos alunos receberam nota: ");
		int qntAlunos = sc.nextInt();
		
		for (int i = 1; i <= qntAlunos; i++) {
			System.out.printf("\nInforme o nome do %dº aluno: ", i);
			String n = sc.next();
			System.out.print("Informe a 1º nota: ");
			double n1 = sc.nextDouble();
			System.out.print("Informe a 2º nota: ");
			double n2 = sc.nextDouble();
			System.out.print("Informe a 3º nota: ");
			double n3 = sc.nextDouble();
			alunos.add(new AlunoEntidade(n, n1, n2, n3));
		}
		
		System.out.println("\nRESULTADOS:");
		for(AlunoEntidade a : alunos) {
			System.out.println(a.resultado());
		}	
		sc.close();
	}
}
