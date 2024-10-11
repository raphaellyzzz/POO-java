package pooAtividadeMedia;

import java.util.Scanner;

public class CalcularMedia {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite nota do primeiro bimestre: ");
		double nota1 = input.nextDouble();
		
		System.out.println("digite nota do segundo bimestre: ");
		double nota2 = input.nextDouble();
		
		double media = ((nota1 * 4) + (nota2 * 6)) / 10;
		
		System.out.println("a media final é: " + media);
		
		input.close();
	}
}
