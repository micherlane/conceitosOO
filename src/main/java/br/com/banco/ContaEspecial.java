package br.com.banco;

public class ContaEspecial extends Conta{
	private double limiteConta;
	
	ContaEspecial(String numeroConta, String senhaConta, double limiteConta){
		super(numeroConta, senhaConta);
		this.limiteConta = limiteConta;
	}
	
	
	@Override
	public String toString() {
		return "ContaEspecial [limiteConta=" + limiteConta + ", numeroConta=" + numeroConta + ", senhaConta="
				+ senhaConta + ", saldoConta=" + saldoConta + "]";
	}

	public double getLimiteConta() {
		return limiteConta;
	}

	public void setLimiteConta(double limiteConta) {
		this.limiteConta = limiteConta;
	}

	public double sacar(double valor) {
		if(valor > (this.limiteConta + this.saldoConta) || valor < 0) {
			return this.saldoConta;
		}
		
		this.saldoConta -= valor;
		return this.saldoConta;
	
	}
}
