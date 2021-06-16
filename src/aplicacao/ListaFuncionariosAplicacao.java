package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.ListaFuncionariosEntidade;

public class ListaFuncionariosAplicacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<ListaFuncionariosEntidade> listaFuncionarios = new ArrayList<>();
		
		System.out.print("Registar quantos funcionários? ");
		int qntFuncionarios = sc.nextInt();
		
		for (int i = 0; i < qntFuncionarios; i++) {
			System.out.println("\nEMPREGADO #" + (i+1) + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			listaFuncionarios.add(new ListaFuncionariosEntidade(id, nome, salario));
		}
		
		System.out.print("\nID do empregado que irá receber aumento: ");
		int idAumento = sc.nextInt();
		
		ListaFuncionariosEntidade funcionario = 
				listaFuncionarios.stream()
				.filter(x -> x.getId() == idAumento)
				.findFirst()
				.orElse(null);
		
		if (funcionario == null) {
			System.out.println("ID não encontrado!");
		} else {
			System.out.print("Informe a porcentagem: ");
			double porcentagem = sc.nextDouble();
			funcionario.aumentarSalario(porcentagem);
		}
		
		Integer posicao = posicaoID(listaFuncionarios, idAumento);
		if (posicao == null) {
			System.out.println("ID não encontrado!");
		} else {
			System.out.print("Informe a porcentagem: ");
			double porcentagem = sc.nextDouble();
			listaFuncionarios.get(posicao).aumentarSalario(porcentagem);
		}
		
		
		for (ListaFuncionariosEntidade funcionarioo : listaFuncionarios) {
			System.out.printf("\nID: %d"
					+ "\nNome: %s"
					+ "\nSalário: %.2f%n",
					funcionarioo.getId(),
					funcionarioo.getNome(),
					funcionarioo.getSalario());
		}
		
		sc.close();
	}
	
	static Integer posicaoID (List<ListaFuncionariosEntidade> lista, Integer ID) {
		for (int i = 0 ; i < lista.size(); i++) {
			if (lista.get(i).getId() == ID) {
				return i;
			} 	
		}
		return null;
		
	}

}
