package entidades;

public class TipoProdutoImportadoEntidade extends TipoProdutoEntidade {

		private Double taxaAlfandegaria;

		public TipoProdutoImportadoEntidade(String nome, Double preco, Double taxaAlfandegaria) {
			super(nome, preco);
			this.taxaAlfandegaria = taxaAlfandegaria;
		}
		
		public double precoTotal() {
			return getPreco() + taxaAlfandegaria;
		}
		
		public String etiqueta() {
			return super.etiqueta() 
					+ "\nTaxa alfandegária: R$ " + String.format("%.2f", getPreco());
		}
}
