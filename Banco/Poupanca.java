package Banco;

public class Poupanca extends Conta {
    private double juros;

    public Poupanca(int numero, double saldo, double juros) {
        super(numero, saldo);
        this.juros = juros;
    }

    public void renderJuros(double juros) {
        setSaldo(getSaldo() + (getSaldo() * juros) / 100);
    }
}
