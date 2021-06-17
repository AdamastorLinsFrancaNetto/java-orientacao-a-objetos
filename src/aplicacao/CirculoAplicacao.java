package aplicacao;

import java.util.Scanner;

import entidades.CirculoUtilitario;

public class CirculoAplicacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("CÍRCULO:");
		System.out.print("Informe o raio: ");
		double raio = sc.nextDouble();

		double circunferencia = CirculoUtilitario.circunferencia(raio);

		double volume = CirculoUtilitario.volume(raio);

		System.out.printf("Circunferência: %.2f%n", circunferencia);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("PI: %.2f%n", CirculoUtilitario.PI);

		sc.close();
	}

}
