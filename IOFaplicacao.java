package aplicacao;

import java.util.Scanner;

import entidade.IOFutilitario;

public class IOFaplicacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cálculo de imposto sobre Operações Financeira:");
		System.out.print("Qual o preço da moeda? ");
		double valor = sc.nextDouble();
		System.out.print("Quanto será comprado? ");
		double quantidade = sc.nextDouble();
		
		System.out.printf("\nO valor a ser pago em reais é = %.2f\n", 
				IOFutilitario.calcIOF(valor, quantidade));
		
		sc.close();
	}

}
