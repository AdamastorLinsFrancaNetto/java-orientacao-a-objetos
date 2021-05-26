package aplicacao;

import java.util.Scanner;

import entidade.IOFutilitario;

public class IOFaplicacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("C�lculo de imposto sobre Opera��es Financeira:");
		System.out.print("Qual o pre�o da moeda? ");
		double valor = sc.nextDouble();
		System.out.print("Quanto ser� comprado? ");
		double quantidade = sc.nextDouble();
		
		System.out.printf("\nO valor a ser pago em reais � = %.2f\n", 
				IOFutilitario.calcIOF(valor, quantidade));
		
		sc.close();
	}

}
