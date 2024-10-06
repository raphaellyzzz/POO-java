package pooAtividade7.Conta;

public class ContaBancaria {
	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	public ContaBancaria(String nome, int numConta, double saldo) {
		this.nomeCliente = nome;
		this.numConta = numConta;
		this.saldo = saldo;		
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double Sacar(double valorSacado) {
		
		if (valorSacado > saldo) {
			System.out.println("Sem saldo, operação cancelada");
			return saldo;
		}else {
			saldo = saldo - valorSacado;
			System.out.println("Saque feito com sucesso!");
			return saldo;
		}		
	}
	
	public void Depositar(double valorQueVaiDepositar) {
		saldo = saldo + valorQueVaiDepositar;
	}
	
	public void calcularNovoSaldo(double percentualRendimento) {
		double taxaRendimento = (saldo * percentualRendimento) / 100;
		saldo = saldo + taxaRendimento;
		System.out.println("Seu novo saldo é: " + saldo);
	}
	
	
	public void ImprimirDados() {
		System.out.println("Seu nome: " + this.nomeCliente);
	    System.out.println("Sua conta é: " + this.numConta);
	    System.out.println("Seu saldo final é: " + saldo);
	    System.out.println("------------------");

	}
}
