package prova.conta;

public abstract class Conta {
    private String cpf;
    private String nome;
    private double saldo;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(){

    }

    public Conta(String cpf, String nome, double saldo) {
        this.cpf = cpf;
        this.nome = nome;
        this.saldo = saldo;
    }

    public abstract void depositar(double valor);

    public abstract void sacar(double valor);

    public abstract double obterSaldo();
}
