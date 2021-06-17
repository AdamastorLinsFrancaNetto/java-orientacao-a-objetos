package aplicacao;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.TipoProdutoEntidade;
import entidades.TipoProdutoImportadoEntidade;
import entidades.TipoProdutoUsadoEntidade;

public class TipoProdutoAplicacao {
	
	public static void main(String[] args) throws ParseException{
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Quantos produtos vai adicionar: ");
		int qntProdutos = sc.nextInt();
		
		List<TipoProdutoEntidade> produtos = new ArrayList<>();
		
		for(int i = 1; i <= qntProdutos; i++) {
			System.out.println("\nDados produto #" + i);
			System.out.print("Comum, importado, usado (c/i/u)? ");
			char resposta = sc.next().charAt(0);
			System.out.print("Nome: ");sc.next();
			String nome = sc.nextLine();
			System.out.print("Preço: R$ ");
			double preco = sc.nextDouble();	
			if (resposta == 'c') {
				produtos.add(new TipoProdutoEntidade(nome, preco));
			}
			else if (resposta == 'i') {
				System.out.print("Taxa alfandegária: R$ ");
				double taxaAlfandegaria = sc.nextDouble();
				produtos.add(new TipoProdutoImportadoEntidade(nome, preco, taxaAlfandegaria));
			}
			else {
				System.out.print("Data de fabricação : ");
				Date dataFabricacao = dataFormatada.parse(sc.next());
				produtos.add(new TipoProdutoUsadoEntidade(nome, preco, dataFabricacao));
			} 

		}
		System.out.println("\nInformação dos produtos:");
		for(TipoProdutoEntidade produto : produtos) {
			System.out.println(produto.etiqueta());
		}
		
		sc.close();
	}

}
