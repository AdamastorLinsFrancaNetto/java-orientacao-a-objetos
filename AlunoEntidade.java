package entidade;

public class AlunoEntidade {
	
	String nomeAluno;
	double nota1;
	double nota2;
	double nota3;
	
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
			resultado = "Aluno: " + this.nomeAluno
					+ "\n"
					+ "M�dia Final = " + this.mediaFinal()
					+ "\nPassou por m�dia!\n";		
		} else if (this.mediaFinal() > 3.0) {
			resultado = "Aluno: " + this.nomeAluno
					+ "\n"
					+ "M�dia final = " + this.mediaFinal()
					+ "\nEm recupera��o!\n"
					+ "Preciar tirar = " + this.calcRecuperacao()
					+ "\n";
		} else {
			resultado = "Aluno: " + this.nomeAluno
					+ "\n"
					+ "M�dia final = " + this.mediaFinal()
					+ "\nReprovado!\n";
		}
		return resultado;
	}

}
