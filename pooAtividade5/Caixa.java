package pooAtividade5;

import java.util.Scanner;
//Escreva um código em java de um caixa do supermercado pergunte quantos itens o cliente irá comprar, deve receber o código (conforme tabela abaixo) e a quantidade do item que deseja comprar
//(deve calcular quantidade X preço de cada item). O programa deve repetir a pergunta de acordo com a quantidade informada pelo cliente. Em seguida, o programa deverá imprimir a soma de todos os valores. 
//(Utilize FOR e IF-ELIF-ELSE). Caso o usuário informe um código errado, informe “código inválido”.

public class Caixa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantidade_comprar = 0;
		double soma = 0;
		int quantidade;
		int codigo;
		double valor = 0;
		
		
		System.out.println("Quantos itens deseja comprar?");
        quantidade_comprar = input.nextInt();
        
        for (int counter = 0; counter < quantidade_comprar; counter++) {
            System.out.println("Código do item:" +
                               "\n 1 -- 0,50" +
                               "\n 2 -- 1,00" +
                               "\n 3 -- 4,00" +
                               "\n 5 -- 7,00" +
                               "\n 9 -- 8,00");
            
            System.out.println("Qual código do seu item?");
            codigo = input.nextInt();
            
            System.out.println("Quantos itens deseja comprar?");
            quantidade = input.nextInt();
            
            if (codigo == 1) {
                valor = quantidade * 0.50;
                
            } else if (codigo == 2) {
                valor = quantidade * 1.00;
                
            } else if (codigo == 3) {
                valor = quantidade * 4.00;
                
            } else if (codigo == 5) {
                valor = quantidade * 7.00;
                
            } else if (codigo == 9) {
                valor = quantidade * 8.00;
                
            } else {
                System.out.println("Código inválido");
                valor = 0;
            }
            
            soma += valor;
        }
        
        System.out.println("O valor total da compra é de: R$" + soma);
        input.close();
    }
}
