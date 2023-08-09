package br.com.banco;

public interface ContaInterface {
	public String emitirSaldo();
	public double depositar(double valor);
	public double sacar(double valor);
}