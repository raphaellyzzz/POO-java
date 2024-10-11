package pooAtividade1;

public class Main {
	public static void main(String[] args) {
		ContaCorrente conta1 = new  ContaCorrente("8454", "34555", 4000.45);
		ContaCorrente conta2 = new ContaCorrente("8759", "78212", 2499);
		
		System.out.println("Saldo da Conta 1: " + conta1.saldo);
        System.out.println("Saldo da Conta 2: " + conta2.saldo);
	}
}
