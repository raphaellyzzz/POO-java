package pooAtividade4;

import java.util.Scanner;
public class Caixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double soma = 0;
        double valor = 0;
        int c;
        double q;

        do {
            System.out.println("Código item"+
                    "\n 1 -- 0,50"+
                    "\n 2 -- 1" +
                    "\n 3 -- 4" +
                    "\n 5 -- 7" +
                    "\n 9 -- 8"
                    );

            System.out.println("Informe o código:");
            c = input.nextInt();
            System.out.println("Informe a quantidade:");
            q = input.nextDouble();


            if (c == 1){
                valor = q * 0.50;
            }
            else if (c==2){
                valor = q * 1;
            }
            else if (c==3){
                valor = q * 4;
            }
            else if (c==5){
                valor = q * 7;
            }
            else if (c==9){
                valor = q * 8;
            }

            else {
                System.out.println("Valor invalido");
            }
            
            soma = soma + valor;
        }while (c != 0);
        input.close();
        System.out.println("A soma foi:"+ soma);
    }
}
