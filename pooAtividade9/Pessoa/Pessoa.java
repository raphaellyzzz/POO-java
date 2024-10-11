package pooAtividade9.Pessoa;

//.Crie um programa que realize a leitura do nome, cpf (final), data de nascimento e altura (todos private) de 3 Pessoas e armazene em uma Lista do tipo Pessoa. Depois imprima todos os dados da lista através do metodo public Pessoa ImprimirDados da classe Pessoa

public class Pessoa {
    private String nome;
    private final String cpf;  // CPF como final
    private String dataNascimento;
    private double altura;

    public Pessoa(String nome, String cpf, String dataNascimento, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public void ImprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Altura: " + this.altura + "m");
        System.out.println();
    }
}
