package br.com.banco;

public class Cliente {
    private String nome;
    private String cpf;


    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public static void registrarCliente(String nome, String cpf) {
        Cliente novoCliente = new Cliente(nome, cpf);
        clientesRegistrados.put(cpf, novoCliente);
        System.out.println("Cliente registrado: " + nome + " (CPF: " + cpf + ")");
    }

    public static Cliente consultarCpf(String cpf) {
        return clientesRegistrados.get(cpf);
    }
}