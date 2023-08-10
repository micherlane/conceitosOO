package br.com.banco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContaEspecialTest {
	private static final double DELTA = 1e-15;	

	@Test
	public void testSaqueComLimiteExcedido() {
		ContaEspecial contaEspecial = new ContaEspecial("00000-0", "admin", 200.0);
		contaEspecial.setSaldoConta(1000);
		
		double saldoAposSaque = contaEspecial.sacar(1100);
		assertEquals("Saque excedeu limite + saldo", -100, saldoAposSaque, DELTA);
	}
	@Test
	public void testSaqueMaiorQueLimiteSaldo() {
		
		ContaEspecial contaEspecial = new ContaEspecial("00000-0", "admin", 200.0);
		contaEspecial.setSaldoConta(1000);
		
		double saldoAposSaque = contaEspecial.sacar(1330);
		
		assertEquals("Saque maior que limite + saldo", 1000, saldoAposSaque,  DELTA);
	}
	
	@Test
	public void testSaqueDentroDoLimite() {
		ContaEspecial contaEspecial = new ContaEspecial("00000-0", "admin", 200.0);
		contaEspecial.setSaldoConta(1000);
		
		double saldoAposSaque = contaEspecial.sacar(500);
		
		assertEquals("Saque dentro do limite", 500, saldoAposSaque, DELTA);
	}
	
	@Test
	public void testSaqueNegativo() {
		ContaEspecial contaEspecial = new ContaEspecial("00000-0", "admin", 200.0);
		contaEspecial.setSaldoConta(1000);
		
		double saldoAposSaque = contaEspecial.sacar(-100);
		
		assertEquals("Saque com valor negativo", 1000, saldoAposSaque, DELTA);
	}
}
