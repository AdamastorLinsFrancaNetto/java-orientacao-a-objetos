package entidades;

import java.util.Scanner;

public class BancoEntidade {
	
	private String nomeCliente;
	final private int numeroConta;
	private double saldoConta;
	
	public BancoEntidade(String nomeCliente, int numeroConta) {
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
	}
	
	public void deposito(double novoDeposito) {
		saldoConta += novoDeposito;
		this.saldo();
	}
	
	public void saque(double valorSaque) {
		double taxa = 5.00;
		if ((saldoConta - valorSaque - taxa) < 0) {
			System.out.println("\nSaldo insuficiente!");
			this.saldo();
		} else {
			saldoConta -= valorSaque + taxa;
			this.saldo();
		}
	}
	
	public void informacaoConta() {
		System.out.printf("\nInformações da conta:"
		+ "\nConta: %d" 
		+ "\nTitular: %s" 
		+ "\nSaldo: %.2f%n%n",
		numeroConta, nomeCliente, saldoConta);
	}
	
	public void saldo() {
		System.out.printf("\nSALDO: %.2f%n%n", saldoConta);
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void depositoInicial () {
		String simOuNao;
		do {
			System.out.print("Deseja realizar um depósito inicial (s/n)? ");
			simOuNao = sc.next();
		} while (!simOuNao.equalsIgnoreCase("s") 
				&& !simOuNao.equalsIgnoreCase("n"));
		
		if (simOuNao.equalsIgnoreCase("s")) {
			System.out.print("Informe o valor do depósito inicial: ");
			double valorDeposito = sc.nextDouble();
			this.deposito(valorDeposito);
		} else {
			this.deposito(0.00);
		}
	}
	
	public void depositoOuSaque () {
		String simOuNao;
		do {
			System.out.print("Deseja fazer depósito ou saque (s/n)? ");
			simOuNao = sc.next();
		} while (!simOuNao.equalsIgnoreCase("s") 
				&& !simOuNao.equalsIgnoreCase("n"));
		
		if (simOuNao.equalsIgnoreCase("s")) {
			String depositoOuSaque;
			do {
				System.out.print("Depósito ou saque (d/s)? ");
				depositoOuSaque = sc.next();
			} while (!depositoOuSaque.equalsIgnoreCase("d") 
					&& !depositoOuSaque.equalsIgnoreCase("s"));
			
			if (depositoOuSaque.equalsIgnoreCase("d")) {
				System.out.print("Informe o valor do depósito: ");
				double valorDeposito = sc.nextDouble();
				this.deposito(valorDeposito);
				this.depositoOuSaque();
			} else {
				System.out.print("Informe o valor do saque: ");
				double valorSaque = sc.nextDouble();
				this.saque(valorSaque);
				this.depositoOuSaque();
			}	
		} else {
			System.out.println("\nVolte sempre!");
		}
	}
	
	

}
