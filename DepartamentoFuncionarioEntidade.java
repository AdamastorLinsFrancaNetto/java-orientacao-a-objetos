package entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidade.enumerado.DepartamentoEmuneracao;

public class DepartamentoFuncionarioEntidade {
	
	private String nome;
	private DepartamentoEmuneracao nivel;
	private Double salarioBase;
	
	private DepartamentoEntidade departamento;
	private List<DepartamentoContrato> contratos = new ArrayList<>();
	
	public DepartamentoFuncionarioEntidade
	(String name, DepartamentoEmuneracao nivel, Double salarioBase, DepartamentoEntidade departamento) {
		this.nome = name;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	public void addContrato(DepartamentoContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(DepartamentoContrato contrato) {
		contratos.remove(contrato);
	}
	
	public Double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for(DepartamentoContrato c : contratos) {
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

	public List<DepartamentoContrato> getContratos() {
		return contratos;
	}

	
	
}
