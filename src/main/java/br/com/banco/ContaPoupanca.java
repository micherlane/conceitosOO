package br.com.banco;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class ContaPoupanca extends Conta{
	private LocalDate dataAniversario;
	
	ContaPoupanca(String numeroConta, String senhaConta){
		super(numeroConta, senhaConta);
		this.dataAniversario = LocalDate.now();
	}
	
	
	@Override
	public String toString() {
		return "ContaPoupanca [dataAniversario=" + dataAniversario + ", numeroConta=" + numeroConta + ", senhaConta="
				+ senhaConta + ", saldoConta=" + saldoConta + "]";
	}


	public LocalDate getDataAniversario() {
		return this.dataAniversario;
	}
	
	public double getRendaConta(LocalDate data, double juros) {
		long meses = this.dataAniversario.until(data, ChronoUnit.MONTHS);
		
		juros = juros / 100;
				
		double valorAtualizado =  this.saldoConta * Math.pow((1 + juros), meses);

		return valorAtualizado;
	}
	
}
