package pooAtividade5;

import java.util.Scanner;

// Escreva um código em Java (usando FOR) para uma tabuada de multiplicação. O usuário informa o número desejado (entre 1 e 10) e o programa deverá imprimir os números e valores (ex. 5 x 1 = 5)

public class Multiplicacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1;
		
		System.out.println("Digite o numero desejado:");
		n1 = input.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			int mul = n1 * i;
			System.out.println(n1 + "x" + i + "=" + mul);
		}
		input.close();
	}
}
