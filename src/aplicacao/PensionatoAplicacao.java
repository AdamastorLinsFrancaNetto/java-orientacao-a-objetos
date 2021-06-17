package aplicacao;

import java.util.Scanner;

import entidades.PensionatoEntidade;

public class PensionatoAplicacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PensionatoEntidade[] quartos = new PensionatoEntidade[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int qntEstudantes = sc.nextInt();
		
		System.out.println("\nCADASTRAMENTO:");
		for (int i = 0; i < qntEstudantes; i++) {
			System.out.println("\nCadastro " + (i+1));
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Qual quarto: ");
			int quarto = sc.nextInt();
			quartos[quarto] = new PensionatoEntidade(nome, id);
		}
		
		System.out.println("\nQuartos ocupados:");
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(
						"\nQuarto: " + i
						+ "\nNome: " + quartos[i].getNome()
						+ "\nID: " + quartos[i].getID());
			}
		}
		
		sc.close();
	}

}
