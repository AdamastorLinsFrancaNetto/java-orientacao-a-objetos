package aplicacao;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entidade.DepartamentoContrato;
import entidade.DepartamentoEntidade;
import entidade.DepartamentoFuncionarioEntidade;
import entidade.enumerado.DepartamentoEmuneracao;

public class DepartamentoAplicacao {
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Informe o nome do departamento: ");
		String departamento = sc.nextLine();
		System.out.println("\nInforme os dados do funcionário:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nível: ");
		String nivel = sc.nextLine();
		System.out.print("Salário base: ");
		double salarioBase = sc.nextDouble();
		
		DepartamentoFuncionarioEntidade funcionario = 
				new DepartamentoFuncionarioEntidade
				(nome, DepartamentoEmuneracao.valueOf(nivel), salarioBase, 
						new DepartamentoEntidade(departamento));
		
		System.out.print("\nQuantos contratos tem o funcionário: ");
		int contratos = sc.nextInt();
		
		for(int i = 1; i <= contratos; i++) {
			System.out.println("\nInforme os dados do contrato #" + i);
			System.out.print("Data (DD/MM/AAAA): ");
			Date dataContrato = dataFormato.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Quantidade de horas: ");
			int horas = sc.nextInt();
			DepartamentoContrato contrato = 
					new DepartamentoContrato(dataContrato, valorPorHora, horas);
			funcionario.addContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Informe mês e ano para calcular o salário(MM/YYYY): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
		System.out.printf("Salário de %s: R$ %.2f", mesEAno, funcionario.renda(ano, mes));
			
		sc.close();
	}

}
