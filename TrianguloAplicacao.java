package aplicacao;

import java.util.Scanner;

import entidade.TrianguloEntidade;

public class TrianguloAplicacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TrianguloEntidade x, y;
		
		System.out.println("Informe o nome e medida do triângulo: ");
		x = new TrianguloEntidade(sc.next(),
				sc.nextDouble(), 
				sc.nextDouble(), 
				sc.nextDouble());
		System.out.println("Informe o nome e medida do triângulo: ");
		y = new TrianguloEntidade(sc.next(),
				sc.nextDouble(), 
				sc.nextDouble(), 
				sc.nextDouble());
		
		x.mostrarArea();
		y.mostrarArea();
		
		x.mostrarMaior(y);
		
		sc.close();
	}
}
