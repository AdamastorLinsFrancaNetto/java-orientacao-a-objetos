package aplicacao;

import java.util.Scanner;

import entidade.AlunoEntidade;

public class AlunoAplicacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do aluno: ");
		String n = sc.next();
		System.out.print("Informe a 1º nota: ");
		double n1 = sc.nextDouble();
		System.out.print("Informe a 2º nota: ");
		double n2 = sc.nextDouble();
		System.out.print("Informe a 3º nota: ");
		double n3 = sc.nextDouble();
		AlunoEntidade aluno1 = new AlunoEntidade(n, n1, n2, n3);
		
		System.out.print("Informe o nome do aluno: ");
		n = sc.next();
		System.out.print("Informe a 1º nota: ");
		n1 = sc.nextDouble();
		System.out.print("Informe a 2º nota: ");
		n2 = sc.nextDouble();
		System.out.print("Informe a 3º nota: ");
		n3 = sc.nextDouble();
		AlunoEntidade aluno2 = new AlunoEntidade(n, n1, n2, n3);
		
		System.out.print("Informe o nome do aluno: ");
		n = sc.next();
		System.out.print("Informe a 1º nota: ");
		n1 = sc.nextDouble();
		System.out.print("Informe a 2º nota: ");
		n2 = sc.nextDouble();
		System.out.print("Informe a 3º nota: ");
		n3 = sc.nextDouble();
		AlunoEntidade aluno3 = new AlunoEntidade(n, n1, n2, n3);
		System.out.println();
		
		System.out.println(aluno1.resultado());
		System.out.println(aluno2.resultado());
		System.out.println(aluno3.resultado());
		
		sc.close();
	}

}
