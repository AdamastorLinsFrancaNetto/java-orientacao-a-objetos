package entidade;

import java.util.ArrayList;
import java.util.List;

public class RestauranteClienteEntidade {
	
	private String nome;
	RestauranteEntidade comida;
	
	public RestauranteClienteEntidade(String nome) {
		this.nome = nome;
	}
	
	List<RestauranteRefeicaoEntidade> listaRefeicao = new ArrayList<>();
	List<RestauranteSobremesaEntidade> listaSobremesa = new ArrayList<>();
	
	public void adicionarRefeicao (RestauranteRefeicaoEntidade refeicao) {
		listaRefeicao.add(refeicao);
	}
	
	public void adicionarSobremesa (RestauranteSobremesaEntidade sobremesa) {
		listaSobremesa.add(sobremesa);
	}

	public void informacoes() {
		double total = 0;
		System.out.println("\nREFEIÇÂO:");
		for(RestauranteRefeicaoEntidade r : listaRefeicao) {
			double subtotal = r.getPesoComida() * r.getPrecoKg();
			total += subtotal;
			System.out.printf("%s - R$ %.2f\n", r.getNome(), subtotal);
		}
		System.out.println("\nSOBREMESA:");
		for(RestauranteSobremesaEntidade s : listaSobremesa) {
			double subtotal = s.getPesoComida() * s.getPrecoKg();
			total += subtotal;
			System.out.printf("%s - R$ %.2f\n", s.getNome(), subtotal);
		}
		System.out.printf("\nTOTAL: R$ %.2f", total);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
