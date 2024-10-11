package pooAtividade4;

import java.util.Scanner;
public class SomaNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        int contador = 1;

        do {
            System.out.println("Digite o numero:");
            int n = input.nextInt();
            soma += n;
            contador++;
        }while (contador <= 5);

        double media = soma / contador;
        System.out.println("Sua média é:" + media);
        System.out.println("A soma é:" + soma);
        input.close();
    }
}
