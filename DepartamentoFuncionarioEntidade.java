package entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidade.enumeracao.DepartamentoEmuneracao;

public class DepartamentoFuncionarioEntidade {
	
	private String nome;
	private DepartamentoEmuneracao nivel;
	private Double salarioBase;
	
	private DepartamentoEntidade departamento;
	private List<DepartamentoContratoEntidade> contratos = new ArrayList<>();
	
	public DepartamentoFuncionarioEntidade
	(String name, DepartamentoEmuneracao nivel, Double salarioBase, DepartamentoEntidade departamento) {
		this.nome = name;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	public void addContrato(DepartamentoContratoEntidade contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(DepartamentoContratoEntidade contrato) {
		contratos.remove(contrato);
	}
	
	public Double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for(DepartamentoContratoEntidade c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}

	public String getNome() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public DepartamentoEmuneracao getNivel() {
		return nivel;
	}

	public void setNivel(DepartamentoEmuneracao nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public DepartamentoEntidade getDepartamento() {
		return departamento;
	}

	public void setDepartamento(DepartamentoEntidade departamento) {
		this.departamento = departamento;
	}

	public List<DepartamentoContratoEntidade> getContratos() {
		return contratos;
	}

	
	
}
