package br.com.banco;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContaPoupancaTest {

	private static final double DELTA = 1e-15;

	@Test
	public void testRendimentoContaDia() {
		ContaPoupanca contaPoupanca = new ContaPoupanca("00000-1", "admin");
		contaPoupanca.setSaldoConta(1000);
		
		LocalDate dataRequirida = LocalDate.of(2023, 8, 11); // Um dia de diferença entre a data aniversário e data fornecida
		double jurosPorcentagem = 0.05; // Juros ao mês
		
		double valorAposCalculadoRendimento = contaPoupanca.getRendaConta(dataRequirida, jurosPorcentagem);
		
		assertEquals("Rendimento calculado com um dia de diferença ", 1000, valorAposCalculadoRendimento, DELTA);
	}
	
	@Test 
	public void testRendimentoContaMes() {
		ContaPoupanca contaPoupanca = new ContaPoupanca("00000-1", "admin");
		contaPoupanca.setSaldoConta(1000);
		
		LocalDate dataRequirida = LocalDate.of(2023, 9, 10); // Um mês de diferença entre a data aniversário e data fornecida
		double jurosPorcentagem = 0.05; // Juros ao mês
		
		double valorAposCalculadoRendimento = contaPoupanca.getRendaConta(dataRequirida, jurosPorcentagem);
		
		assertEquals("Rendimento calculado com um mês de diferença ", 1000.5, valorAposCalculadoRendimento, DELTA);
	}
	
	@Test 
	public void testRendimentoContaAno(){
		ContaPoupanca contaPoupanca = new ContaPoupanca("00000-1", "admin");
		contaPoupanca.setSaldoConta(1000);
		
		LocalDate dataRequirida = LocalDate.of(2024, 8, 10); // Um ano de diferença entre a data aniversário e data fornecida
		double jurosPorcentagem = 0.05; // Juros ao mês
		
		double valorAposCalculadoRendimento = contaPoupanca.getRendaConta(dataRequirida, jurosPorcentagem);
		
		assertEquals("Rendimento calculado com um ano de diferença ", 1006.0165275309616, valorAposCalculadoRendimento, DELTA);
	}

}
