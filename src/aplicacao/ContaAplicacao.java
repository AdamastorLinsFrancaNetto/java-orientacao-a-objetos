package aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entidades.ContaEntidade;
import entidades.ContaPjEntidade;
import entidades.ContaPfEntidade;
import entidades.ContaPpEntidade;
import entidades.excecoes.ContaExcecao;

public class ContaAplicacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		List<ContaEntidade> listaContas = new ArrayList<>();
	
		System.out.print("Qual tipo de conta (pf/pj/pp): ");
		String tipo = sc.nextLine();
		ContaEntidade conta = null;
		
		System.out.print("Agência: ");
		Integer agencia = sc.nextInt();
		System.out.print("Nº da conta: ");
		Integer numeroConta = sc.nextInt();
		System.out.print("Correntista: ");sc.next();
		String correntista = sc.nextLine();	
		System.out.print("Saldo inicial: R$ ");
		Double saldo = sc.nextDouble();
		System.out.print("Limite de saque: R$ ");
		Double limiteSaque = sc.nextDouble();
		
		if(tipo.equalsIgnoreCase("pf")) {
			boolean cartaocredito = false;
			System.out.print("Liberar cartão de crédito (s/n): ");
			Character sn = sc.next().charAt(0);
			if (sn == 's') {
				cartaocredito = true;
			}
			conta = new ContaPfEntidade(correntista, agencia, numeroConta, saldo, limiteSaque, cartaocredito);
			listaContas.add(conta);
		}
		else if(tipo.equalsIgnoreCase("pj")) {
			System.out.print("Limite de empréstimo: R$ ");
			Double limiteEmprestimo = sc.nextDouble();
			conta = new ContaPjEntidade(correntista, agencia, numeroConta, saldo, limiteSaque, limiteEmprestimo);
			listaContas.add(conta);
		}
		else if(tipo.equalsIgnoreCase("pp")) {
			System.out.print("Taxa de juros: ");
			Double taxaJuros = sc.nextDouble();
			conta = new ContaPpEntidade(correntista, agencia, numeroConta, saldo, limiteSaque, taxaJuros);
			listaContas.add(conta);
		} else {
			System.out.println("Tipo de conta inexistente!");
		}
		
		System.out.print("\nTeste deposito: R$ ");
		Double valor = sc.nextDouble();
		conta.deposito(valor);
			
		try {	
			System.out.print("\nTeste saque: R$ ");
			valor = sc.nextDouble();
			conta.saque(valor);
		}
		catch(ContaExcecao ex) {
			System.out.println("Erro de saque: " + ex.getMessage());
		}
		
		//Conta para teste de transferência
		ContaEntidade teste = new ContaPpEntidade();
		
		try {
			System.out.print("\nTeste tranferência: R$ ");
			valor = sc.nextDouble();
			conta.transfere(valor, teste);
		} catch (ContaExcecao ex){
			System.out.println("Erro na tranferência: " + ex.getMessage());
		}
		
		System.out.println(conta);
		
		Collections.sort(listaContas);
		
		listaContas.forEach( contas -> System.out.println(contas));
		
		sc.close();
	}
}
