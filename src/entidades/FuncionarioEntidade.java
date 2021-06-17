package entidades;

public class FuncionarioEntidade {
	
	String nome;
	double salarioBruto;
	double imposto;
	
	public FuncionarioEntidade(String nome, double salarioBruto, double imposto) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario (double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100;
	}
	
	public void informacoesFuncionario() {
		System.out.printf("\nDados atualizados:%n"
				+ "Funcion�rio: %s%n"
				+ "Sal�rio l�quido: R$ %.2f%n%n", this.nome, this.salarioLiquido());
	}
	
	public String toString() {
		return "Funcion�rio: " + nome
				+ "\nSal�rio l�quido: R$" + this.salarioLiquido()
				+ "\n";
	}
}
