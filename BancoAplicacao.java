package aplicacao;

import java.util.Scanner;

import entidade.BancoEntidade;

public class BancoAplicacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Insira o nome do titular da conta: ");
		String nomeCliente = sc.next();
	
		BancoEntidade cliente1 = new BancoEntidade(nomeCliente, numeroConta);
		
		cliente1.depositoInicial();
		cliente1.informacaoConta();
		cliente1.depositoOuSaque();

		sc.close();	
	}

}
