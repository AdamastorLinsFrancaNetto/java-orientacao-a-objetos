package entidades;

public class ListaFuncionariosEntidade {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public ListaFuncionariosEntidade(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public ListaFuncionariosEntidade() {
	}
	
	public void aumentarSalario(double porcentagem) {
		salario += (salario * porcentagem / 100);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	
	
	
	
	
	
	
	

}
