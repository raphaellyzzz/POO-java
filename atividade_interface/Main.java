package atividade_interface;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        smartphone.estacao("101.5 AM FM");

        smartphone.coordenadas(37.7749, -122.4194);

        float soma = smartphone.somar(10.5f, 5.5f);
        System.out.println("resultado da soma: " + soma);

        float divisao = smartphone.dividir(10.0f, 2.0f);
        System.out.println("resultado da divisão: " + divisao);

        smartphone.dividir(10.0f, 0.0f);
    }
}
