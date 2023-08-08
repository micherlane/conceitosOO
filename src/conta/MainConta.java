package conta;

public class MainConta {

	public static void main(String[] args) {
		Conta contaComum = new Conta("10001-1", "senha", 1000.0);
		
		System.out.println("\nINFORMAÇÕES DA CONTA");
		System.out.println(contaComum.toString());
		
		System.out.println("\nTRANSAÇÕES");
		System.out.println("Novo Saldo: R$ " + contaComum.depositar(40));
		System.out.println("Novo Saldo: R$ " + contaComum.sacar(1000));
		
		System.out.println("\nEXTRATO\n" + contaComum.emitirSaldo());
	}

}
