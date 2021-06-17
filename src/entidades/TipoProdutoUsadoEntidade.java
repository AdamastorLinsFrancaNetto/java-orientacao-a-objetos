package entidades;

import java.util.Date;

public class TipoProdutoUsadoEntidade extends TipoProdutoEntidade{
	
	private Date datadeFabricao;

	public TipoProdutoUsadoEntidade(String nome, Double preco, Date datadeFabricao) {
		super(nome, preco);
		this.datadeFabricao = datadeFabricao;
	}

	public String etiqueta(){
		return super.etiqueta() +
				"\nData de Fabricação: " + String.format("dd/MM/yyyy", datadeFabricao);
	}

}
