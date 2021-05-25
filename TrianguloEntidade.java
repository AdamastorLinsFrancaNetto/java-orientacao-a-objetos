package entidade;

public class TrianguloEntidade {
	
	String nomeTriangulo;
	public double a, b, c;
	
	
	public TrianguloEntidade(String nomeTriangulo, double aa, double bb, double cc){
		this.nomeTriangulo = nomeTriangulo;
		this.a = aa;
		this.b = bb;
		this.c = cc;
	}
	
	public double calcularArea() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	public void mostrarArea() {
		System.out.printf("A �rea do tri�ngulo %s �: %.2f%n", nomeTriangulo, 
				this.calcularArea());
	}
	
	public void mostrarMaior(TrianguloEntidade triangulo2) {
		if (this.calcularArea() > triangulo2.calcularArea()) {
			System.out.printf("O tri�ngulo com maior �rea �: %s%n", this.nomeTriangulo);
		} else if (triangulo2.calcularArea() > this.calcularArea()) {
			System.out.printf("O tri�ngulo com maior �rea �: %s%n", triangulo2.nomeTriangulo);
		} else {
			System.out.printf("Os tri�ngulos %s e %s tem a mesma �rea.%n", 
					this.nomeTriangulo, triangulo2.nomeTriangulo);
		}
	}
}
