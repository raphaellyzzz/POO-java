package pooAtividade9.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

//.Crie um programa que realize a leitura do nome, cpf (final), data de nascimento e altura (todos private) de 3 Pessoas e armazene em uma Lista do tipo Pessoa. Depois imprima todos os dados da lista através do metodo public Pessoa ImprimirDados da classe Pessoa

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite os dados da pessoa " + i + ":");

            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("CPF: ");
            String cpf = input.nextLine();

            System.out.print("Data de Nascimento: ");
            String dataNascimento = input.nextLine();

            System.out.print("Altura: ");
            double altura = input.nextDouble();
            input.nextLine();

            Pessoa pessoa = new Pessoa(nome, cpf, dataNascimento, altura);
            listaPessoas.add(pessoa);
        }

        System.out.println("\nDados das pessoas:");
        System.out.println("---------------------");
        for (Pessoa pessoa : listaPessoas) {
            pessoa.ImprimirDados();
        }
        System.out.println("---------------------");
        input.close();
    }
}
