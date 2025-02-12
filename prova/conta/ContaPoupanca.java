package prova.conta;

public class ContaPoupanca extends Conta{
    private double juros;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String cpf, String nome, double saldo, double juros) {
        super(nome, cpf, saldo);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public void renderJuros(double juros) {
        juros = (getSaldo() * juros) / 100;
        setSaldo(getSaldo() + juros);
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo() - valor);
    }

    @Override
    public double obterSaldo() {
        return getSaldo();
    }
}
