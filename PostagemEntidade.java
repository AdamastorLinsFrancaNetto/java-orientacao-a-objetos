package entidade;

import java.util.ArrayList;
import java.util.List;

public class PostagemEntidade {
	
	String data;
	private String titulo;
	private String conteudo;
	private Integer curtidas = 0;
	
	public PostagemEntidade
	(String data, String titulo, String conteudo) {
		this.data = data;
		this.titulo = titulo;
		this.conteudo = conteudo;
	}
	
	List<PostagemComentarioEntidade> comentarios = new ArrayList<PostagemComentarioEntidade>();
	
	public void adicionarComentario(String comentario) {
		PostagemComentarioEntidade postagem = new PostagemComentarioEntidade(comentario);
		comentarios.add(postagem);
	}
	
	public void removerComentario(PostagemComentarioEntidade comentario) {
		comentarios.remove(comentario);
	}
	
	public int adicionarCurtida(int qntCurtidas) {
		for (int i = 0; i < qntCurtidas; i++) {
			curtidas++;
		}
		return curtidas;
	}
	
	public List<PostagemComentarioEntidade> getComentarios() {
		return comentarios;
	}

	public void obterComentarios() {
		for(PostagemComentarioEntidade comentario : comentarios) {
			System.out.println(comentario.getComentario());
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nInformações da postagem:");
		sb.append("\nTítulo: " + this.getTitulo());
		sb.append("\nConteúdo: " + this.getConteudo());
		sb.append("\n" + this.getCurtidas() + " curtidas - " + this.getData());
		sb.append("\nComentários:\n");
		for(PostagemComentarioEntidade comentario : comentarios) {
			sb.append(comentario.getComentario() + "\n");
		}
		return sb.toString();
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	

}
