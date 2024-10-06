package pooAtividade4;

import java.util.Scanner;

public class calcularMedia {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nota do primeiro bimestre");
        double nota1 = input.nextDouble();

        System.out.println("Nota do segundo bimestre");
        double nota2 = input.nextDouble();

        double mediaAluno = (nota1 + nota2) / 2;
        System.out.println("Sua média:" + mediaAluno);
        input.close();

        if (mediaAluno >= 7){
            System.out.println("Aprovado");
        }else if (mediaAluno >= 4){
            System.out.println("Final");
        }else{
            System.out.println("Reprovado");
        }
    }
}
