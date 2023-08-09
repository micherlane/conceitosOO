package br.com.banco;

import java.time.*;

import java.text.NumberFormat;
import java.util.Locale;
import java.text.MessageFormat;

public class MainConta {

	public static void main(String[] args) {
		Locale localeBR = new Locale("pt","BR");
		NumberFormat formatMoeda = NumberFormat.getCurrencyInstance(localeBR);
		double valorDeposito = 40;
		double valorSaque = 1000;
		
		
		Conta contaComum = new Conta("10001-1", "senha", 1000.0);
		Conta contaComum2 = new Conta("100012-1", "senha");
		ContaEspecial contaEspecial = new ContaEspecial("9999-9", "123", 200);
		ContaPoupanca contaPoupanca = new ContaPoupanca("8888-8", "23424");
		
		System.out.println("\nINFORMAÇÕES DA CONTA COMUM");
		System.out.println(contaComum.toString());		
		
		System.out.println("\nOperações com a conta comum:\n");
		System.out.println(MessageFormat.format("Depósito:\n Valor inicial: R$ {0}, Valor depósito: R$ {1}, Valor final: R$ {2}", contaComum.getSaldoConta(), valorDeposito, contaComum.depositar(40)));
		System.out.println(MessageFormat.format("Saque:\n Valor inicial: R$ {0}, Valor saque: R$ {1}, Valor final: R$ {2}", contaComum.getSaldoConta(), valorSaque, contaComum.sacar(1000)));
		
		System.out.println("\nEXTRATO\n" + contaComum.emitirSaldo());
		
		
				
		System.out.println("\nINFORMAÇÕES DA CONTA Especial");
		System.out.println(contaEspecial.toString());		
		
		System.out.println("\nOperações com a conta especial:\n");
		System.out.println(MessageFormat.format("Depósito:\n Valor inicial: R$ {0}, Valor depósito: R$ {1}, Valor final: R$ {2}", contaEspecial.getSaldoConta(), 1300, contaEspecial.depositar(1300)));
		System.out.println(MessageFormat.format("Saque:\n Valor inicial: R$ {0}, Valor saque: R$ {1}, Valor final: R$ {2}", contaEspecial.getSaldoConta(), 1400, contaEspecial.sacar(1400)));
		
		System.out.println("\nEXTRATO\n" + contaEspecial.emitirSaldo());
		
		

		System.out.println("\nINFORMAÇÕES DA CONTA POUPANÇA");
		System.out.println(contaPoupanca.toString());		
		
		System.out.println("\nOperações com a conta poupança:\n");
		System.out.println(MessageFormat.format("Depósito:\n Valor inicial: R$ {0}, Valor depósito: R$ {1}, Valor final: R$ {2}", contaPoupanca.getSaldoConta(), 1000, contaPoupanca.depositar(1000)));
		
		System.out.println("\nEXTRATO\n" + contaPoupanca.emitirSaldo());
		
		System.out.println("Calcular rendimentos na data de 2025/08/09 a uma taxa de juros de 0.05% ao mês");
		LocalDate data = LocalDate.of(2025, 8, 9);	
		System.out.println("Valor rendido no período R$ " + formatMoeda.format(contaPoupanca.getRendaConta(data, 0.5)));
		
	}

}