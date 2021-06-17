package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.ReservaEntidade;
import entidades.excecoes.ReservaExcecao;

public class ReservaAplicacao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Hóspede: ");
			String hospede = sc.nextLine();
			System.out.print("Nº do quarto: ");
			int quarto = sc.nextInt();
			System.out.print("Data de entrada (dd/MM/aaaa): ");
			Date dataEntrada = dataFormatada.parse(sc.next());
			System.out.print("Data de saida (dd/MM/aaaa): ");
			Date dataSaida = dataFormatada.parse(sc.next());
	
			ReservaEntidade reserva1 = new ReservaEntidade
			(hospede, quarto, dataEntrada, dataSaida);
			System.out.println(reserva1);
			
			System.out.println("\nInforme a atualização para data de reserva:");
			System.out.print("Data de entrada (dd/MM/aaaa): ");
			dataEntrada = dataFormatada.parse(sc.next());
			System.out.print("Data de saida (dd/MM/aaaa): ");
			dataSaida = dataFormatada.parse(sc.next());
			
			reserva1.atualizarDatas(dataEntrada, dataSaida);
			System.out.println(reserva1);
		}
		catch (ParseException e) {
			System.out.println("Data inválida!");
		}
		catch (ReservaExcecao e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado!");
		}
	
		sc.close();
	}

}
