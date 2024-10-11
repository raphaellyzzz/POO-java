package pooAtividade7.Teste;

import pooAtividade7.Conta.*;


public class Main {
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("ari", 10, 1000.0);
		ContaBancaria conta2 = new ContaBancaria("fulano", 20, 10.5);
		
		System.out.println("---------------------------");
		
		System.out.println("Conta com valor suficiente para saque:");
		conta1.Sacar(50.0);
		System.out.println("---------------------------");
		
		System.out.println("Conta sem valor suficiente para saque:");
		conta2.Sacar(20.0);
		System.out.println("---------------------------");
		
		System.out.println("Depositando...");
		conta1.Depositar(1500);
		conta2.Depositar(1500);
		
		System.out.println("---------------------------");
		System.out.println("Adicionando percentual...");
		conta1.calcularNovoSaldo(4.35);
		conta2.calcularNovoSaldo(4.35);
		
		System.out.println("---------------------------");
		System.out.println("Imprimindo dados...");
		System.out.println("---------------------------");
		System.out.println("");
		
		conta1.ImprimirDados();
		conta2.ImprimirDados();
		
		System.out.println("Fim do programa");
	}
}
