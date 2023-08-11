package br.com.banco;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Conta> contas = new ArrayList<Conta>();


    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

	public ArrayList<Conta> getConta() {
		return this.contas;
	}
    
    public void addConta(Conta conta) {
    	this.contas.add(conta);
    }
    
    public Conta removeConta(String numeroConta) {
    	for(Conta conta: this.contas) {
    		if(conta.numeroConta == numeroConta) {
    			this.contas.remove(conta);
    			return conta;
    		}
    	}
    	return null;
    }

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", \ncontas=" + contas + "]";
	}
   
}