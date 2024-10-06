package atividade.pack1;

public class Pessoa {
    private String nome;
    private int ano_nasc;
    private double altura;

    public Pessoa(String nome, int ano_nasc, double altura){
        this.nome = nome;
        this.ano_nasc = ano_nasc;
        this.altura = altura;
    }
    public void ImprimirDados(){
        System.out.println("Seu nome: " + this.nome);
        System.out.println("Seu ano de nascimento é: " + this.ano_nasc);
        System.out.println("Sua altura é essa: " + this.altura);
        System.out.println("------------------");
    }
    public int CalcularIdade(){
        int calculo = 2024 - ano_nasc;
        System.out.println("Sua idade é " + calculo);
        return calculo;
    }
    public double getAltura() {
    	return this.altura;
    }
}
