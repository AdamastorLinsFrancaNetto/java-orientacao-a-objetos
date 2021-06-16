package entidade;

public class TrianguloEntidade {
	
	String nomeTriangulo;
	public double a;
	public double b;
	public double c;
	
	public TrianguloEntidade(String nomeTriangulo, double a, double b, double c){
		this.nomeTriangulo = nomeTriangulo;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double calcularArea() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	public void mostrarArea() {
		System.out.printf("A área do triângulo %s é: %.2f%n", nomeTriangulo, 
				this.calcularArea());
	}
	
	public void mostrarMaior(TrianguloEntidade triangulo2) {
		if (this.calcularArea() > triangulo2.calcularArea()) {
			System.out.printf("O triângulo com maior área é: %s%n", this.nomeTriangulo);
		} else if (triangulo2.calcularArea() > this.calcularArea()) {
			System.out.printf("O triângulo com maior área é: %s%n", triangulo2.nomeTriangulo);
		} else {
			System.out.printf("Os triângulos %s e %s tem a mesma área.%n", 
					this.nomeTriangulo, triangulo2.nomeTriangulo);
		}
	}
}
