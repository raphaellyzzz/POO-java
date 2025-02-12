package prova.negocios;

import prova.tributos.Tributavel;

public class SeguroDeVida implements Tributavel {
    private String cpf;
    private String nome;
    private double valor;

    public SeguroDeVida(){

    }

    public SeguroDeVida(String cpf, String nome, double valor) {
        this.cpf = cpf;
        this.nome = nome;
        this.valor = valor;
    }

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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void emitirApolice(){
        System.out.println("Apolice emitida");
    }

    @Override
    public double calcularTributos() {
        return valor += 42;
    }
}
