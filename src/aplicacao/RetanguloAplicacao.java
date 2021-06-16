package aplicacao;

import java.util.Scanner;

import entidade.RetanguloEntidade;

public class RetanguloAplicacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("RETÂNGULO:");
		System.out.print("Informe a altura: ");
		double altura = sc.nextDouble();
		System.out.print("Informe a largura: ");
		double largura = sc.nextDouble();
		System.out.println();
		
		RetanguloEntidade r1 = new RetanguloEntidade(altura, largura);
		
		r1.mostrarResultado();
		
		sc.close();		
	}

}
