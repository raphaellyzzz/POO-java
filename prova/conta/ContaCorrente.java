package prova.conta;

import prova.tributos.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente() {

    }
    public ContaCorrente(String cpf, String nome, double saldo) {
        super(cpf, nome, saldo);
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


    @Override
    public double calcularTributos() {
        return (getSaldo() * 1) / 100;
    }
}
