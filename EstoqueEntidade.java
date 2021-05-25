package entidade;

public class EstoqueEntidade {
	
	public String nome;
	public double preco;
	public int quantidade;

	public EstoqueEntidade(String nome, double preco, int quatidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quatidade;
	}
	
	public double valorTotalEmEstoque() {
		return quantidade * preco;
	}
	
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
		System.out.println("\n" + this.toString());
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
		System.out.println("\n" + this.toString());
	}
	
	public String toString() {
		return "DADOS ATUALIZADOS"
				+ "\nNome: " + nome
				+ "\nPreço: " + String.format("%.2f", preco)
				+ "\nQuantidade: " + quantidade
				+ "\nValor total: " + String.format("%.2f", valorTotalEmEstoque())
				+ "\n";
	}
	public void mostrarInformacoesEstoque() {
		System.out.printf("DADOS DO ESTOQUE:%n"
				+ "Nome: %s%n"
				+ "Preço: R$ %.2f%n"
				+ "Quantidade em estoque: %d%n"
				+ "Valor total: R$ %.2f%n"
				+ "\n",
				nome, preco, quantidade, this.valorTotalEmEstoque());
		
	}

}
