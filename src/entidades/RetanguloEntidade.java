package entidades;

public class RetanguloEntidade {
	
	double altura;
	double largura;
	
	public RetanguloEntidade(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public double area() {
		return altura * largura;
	}
	
	public double perimetro() {
		return 2 * (altura + largura);
	}
	
	public double diagonal() {
		return Math.sqrt(altura * altura + largura * largura);
	}
	
	public void mostrarResultado() {
		System.out.printf(
				"�REA = %.2f%n"
				+ "PER�METRO = %.2f%n"
				+ "DIAGONAL = %.2f%n",
				this.area(),
				this.perimetro(),
				this.diagonal());
	}
	
	
}
