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
				+ "Funcionário: %s%n"
				+ "Salário líquido: R$ %.2f%n%n", this.nome, this.salarioLiquido());
	}
	
	public String toString() {
		return "Funcionário: " + nome
				+ "\nSalário líquido: R$" + this.salarioLiquido()
				+ "\n";
	}
}
