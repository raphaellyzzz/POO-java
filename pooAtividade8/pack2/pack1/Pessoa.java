package pooAtividade8.pack2.pack1;

//um programa que realize a leitura do nome, cpf (final), data de nascimento e altura (todos private) de 3 Pessoas e armazene em um vetor do tipo pessoa. Depois imprima todos os dados do vetor através do metodo ImprimirDados da classe Pessoa

public class Pessoa {
    private String nome;
    private final String cpf;
    private int ano_nasc;
    private double altura;
    public Pessoa(String nome, String cpf, int ano_nasc, double altura){
        this.nome = nome;
        this.cpf = cpf;
        this.ano_nasc = ano_nasc;
        this.altura = altura;
    }

    //public String getNome(){
    //    return this.nome;
    //} usando get

    public void ImprimirDados(){
        System.out.println("Seu nome: " + this.nome);
        System.out.println("Seu cpf: " + this.cpf);
        System.out.println("Seu ano de nascimento é: " + this.ano_nasc);
        System.out.println("Sua altura é essa: " + this.altura);
        System.out.println("------------------");
    }
}
