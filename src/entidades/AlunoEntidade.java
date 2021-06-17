package entidades;

public class AlunoEntidade {
	
	private String nomeAluno;
	private Double nota1;
	private Double nota2;
	private Double nota3;
	
	public AlunoEntidade(String nomeAluno, double nota1, double nota2, double nota3) {
		this.nomeAluno = nomeAluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public double mediaFinal() {
		return (nota1 + nota2 + nota3) / 3;
	}
	
	public double calcRecuperacao() {
		return (30 - this.mediaFinal()) / 3;
	}
	
	public String resultado() {
		String resultado;
		if (this.mediaFinal() > 7.0) {
			resultado = "\nNome: " + this.nomeAluno
					+ "\n"
					+ "Média Final = " + String.format("%.1f", this.mediaFinal())
					+ "\nPassou por média!";		
		} else if (this.mediaFinal() > 3.0) {
			resultado = "\nNome: " + this.nomeAluno
					+ "\n"
					+ "Média final = " + String.format("%.1f", this.mediaFinal())
					+ "\nEm recuperação!\n"
					+ "Preciar tirar = " + String.format("%.1f", this.calcRecuperacao());
		} else {
			resultado = "\nNome: " + this.nomeAluno
					+ "\n"
					+ "Média final = " + String.format("%.1f", this.mediaFinal())
					+ "\nReprovado!";
		}
		return resultado;
	}

}
