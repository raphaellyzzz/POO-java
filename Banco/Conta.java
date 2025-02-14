package Banco;

public class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        System.out.println("O seu saldo é: " + getSaldo());
    }

    public void transferir(double valor, Conta contaDestino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
}