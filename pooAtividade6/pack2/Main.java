package atividade.pack2;

import atividade.pack1.*;

public class Main{
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Ari", 2004, 1.64);
        Pessoa pessoa2 = new Pessoa("Ricson Santana", 1982, 1.77);

        System.out.println("Imprimindo os dados... ");
        pessoa1.ImprimirDados();
        pessoa2.ImprimirDados();

        System.out.println("As idades foram, respectivamente: ");
        pessoa1.CalcularIdade();
        pessoa2.CalcularIdade();
        
        System.out.println("----------------------------------------------------------");
        
        if (pessoa1.getAltura() > pessoa2.getAltura()){
            System.out.println("O mais alto(a) é: ");
            pessoa1.ImprimirDados();
        }else {
        	System.out.println("O mais alto(a) é: ");
        	pessoa2.ImprimirDados();
        }
        
        if (pessoa1.CalcularIdade() > pessoa2.CalcularIdade()) {
        	System.out.println("O mais velho(a) é: ");
        	pessoa1.ImprimirDados();
        }else {
        	System.out.println("O mais velho(a) é: ");
        	pessoa2.ImprimirDados();
        }
       

    }
}