package aplicacao;

import java.util.Scanner;

import entidade.CirculoUtilitario;

public class CirculoAplicacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("CÍRCULO:");
		System.out.print("Informe o raio: ");
		double raio = sc.nextDouble();

		double c = CirculoUtilitario.circunferencia(raio);

		double v = CirculoUtilitario.volume(raio);

		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", CirculoUtilitario.PI);

		sc.close();
	}

}
