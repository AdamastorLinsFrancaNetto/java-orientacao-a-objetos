package aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entidades.PostagemEntidade;

public class PostagemAplicacao {
	
	public static void main(String[] args) {
		
		DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String data = dataFormato.format(LocalDateTime.now());
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Título: ");
		String titutlo = sc.nextLine();
		System.out.print("Conteúdo: ");
		String conteudo = sc.nextLine();
		
		PostagemEntidade postagem1 = new PostagemEntidade(data, titutlo, conteudo);
		
		System.out.println("\nMENSAGEM ENVIDADA!");
		System.out.println(postagem1.getData());
		System.out.println("Título: " + postagem1.getTitulo());
		System.out.println("Conteúdo: " + postagem1.getConteudo());
		
		System.out.print("\nQuantas curtidas: ");
		int curtidas = sc.nextInt();
		postagem1.adicionarCurtida(curtidas);
		
		System.out.print("\nQuantos comentário: ");
		int qntComentarios = sc.nextInt();
		for (int i = 1; i <= qntComentarios; i++) {
			System.out.print("Comentário #" + i + ": ");
			sc.next();
			String comentario = sc.nextLine();
			postagem1.adicionarComentario(comentario);
		}

		System.out.println(postagem1);
		
		sc.close();
	}

}
