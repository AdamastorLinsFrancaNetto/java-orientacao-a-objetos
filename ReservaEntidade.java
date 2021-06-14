package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import entidade.excecoes.ReservaExcecao;

public class ReservaEntidade {
	
	private String nomeCliente;
	private Integer numeroQuarto;
	private Date dataEntrada;
	private Date dataSaida;
	
	private static SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
	
	public ReservaEntidade(String nomeCliente, Integer numeroQuartp, Date dataEntrada, Date dataSaida) throws ReservaExcecao {
		if (!dataSaida.after(dataEntrada)) {
			throw new ReservaExcecao("A data de saída não pode ser antes da data de entrada!");
		}
		this.nomeCliente = nomeCliente;
		this.numeroQuarto = numeroQuartp;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getDataaEntrada() {
		return dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public long duracao() {
		long diferenca = dataSaida.getTime() - dataEntrada.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}
	
	public void atualizarDatas(Date diaEntrada, Date diaSaida) throws ReservaExcecao {
		Date agora = new Date();
		if (dataEntrada.before(agora) || dataSaida.before(agora)) {
			throw new ReservaExcecao("A data da reserva deve ser atualizada com datas futuras!");
		}
		if (dataEntrada.before(agora) && dataSaida.before(agora)) {
			throw new ReservaExcecao("A data da reserva deve ser atualizada com datas futuras!");
		}
		if (!dataSaida.after(dataEntrada)) {
			throw new ReservaExcecao("A data de saída não pode ser antes da data de entrada!");
		}
		this.dataEntrada = diaEntrada;
		this.dataSaida = diaSaida;
	}
	
	@Override
	public String toString() {
		return "\nRESERVA:"
			+ "\nHóspede: " + getNomeCliente()
			+ "\nNº do quarto: " + getNumeroQuarto()
			+ "\nDia de Entrada: " + dataFormatada.format(dataEntrada)
			+ "\nDia de Saída: " + dataFormatada.format(dataSaida)
			+ "\nDuração: " + duracao() + " noites";
	}
}
