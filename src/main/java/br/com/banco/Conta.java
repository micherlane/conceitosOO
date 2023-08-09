package br.com.banco;

public class Conta implements ContaInterface{
	protected String numeroConta;
	protected String senhaConta;
	protected double saldoConta;
	
	Conta(String numeroConta, String senhaConta, double saldoConta){
		this.numeroConta = numeroConta;
		this.senhaConta = senhaConta;
		this.saldoConta = saldoConta;
	}
	
	Conta(String numeroConta, String senhaConta){
		this.numeroConta = numeroConta;
		this.senhaConta = senhaConta;
		this.saldoConta = 0;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getSenhaConta() {
		return senhaConta;
	}
	public void setSenhaConta(String senhaConta) {
		this.senhaConta = senhaConta;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	public String emitirSaldo() {
		return "Nº Conta: " + this.numeroConta + "\nSaldo: R$ " + this.saldoConta;
	}
	
	
	@Override
	public String toString() {
		return "numeroConta:" + numeroConta + "\nsenhaConta:" + senhaConta + "\nsaldoConta: R$ " + saldoConta;
	}

	public double depositar(double valor) {
		// Se o valor for negativo, o valor do saldo é 
		// retornado;
		if(valor < 0) {
			return this.saldoConta;
		}
		
		this.saldoConta += valor;
		
		return this.saldoConta;
	}
	
	public double sacar(double valor) {
		// Caso o valor solicitado for maior que o saldo na conta,
		// é retornado o valor da conta sem alteração.
		if (valor > this.saldoConta || valor < 0) {
			return this.saldoConta;
		}
		
		this.saldoConta -= valor;
		return this.saldoConta;
	}
}