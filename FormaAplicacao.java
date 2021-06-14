package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.FormaCirculoEntidade;
import entidade.FormaEntidade;
import entidade.FormaRetanguloEntidade;
import entidade.enumeracoes.FormaEnumeracao;

public class FormaAplicacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<FormaEntidade> formas = new ArrayList<>();
		
		System.out.print("Informe o número de formas: ");
		int quantidade = sc.nextInt();
		
		for(int i = 1; i <= quantidade; i++) {
			System.out.println("\nDados da forma #" + i);
			System.out.print("Círculo ou retângulo (c/r): ");
			char cr = sc.next().charAt(0);
			System.out.print("Cor (AZUL/BRANCO/PRETO): ");
			FormaEnumeracao cor = FormaEnumeracao.valueOf(sc.next());
			if (cr == 'c') {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				formas.add(new FormaCirculoEntidade(cor, raio));
			} 
			else if (cr == 'r') {
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				formas.add(new FormaRetanguloEntidade(cor, largura, altura));
			}
			else {
				System.out.println("Forma inválida!");
			}		
		}	
		
		System.out.println("\nÁREA DAS FORMAS:");	
		for(FormaEntidade f : formas) {
			System.out.println(f.toString());
		}
		
		sc.close();
	}
}
