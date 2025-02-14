package abs;

import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o nome do presidente: ");
        String nomeInformado = input.next();
        System.out.println("Informe o cpf do presidente: ");
        String cpfInformado = input.next();
        System.out.println("Informe o salario do presidente: ");
        double salarioInformado = input.nextDouble();

        Presidente presidente = new Presidente(nomeInformado, cpfInformado, salarioInformado);

        System.out.println("Informe o nome do gerente: ");
        String nomeInformadoG = input.next();
        System.out.println("Informe o cpf do gerente: ");
        String cpfInformadoG = input.next();
        System.out.println("Informe o salario do gerente: ");
        double salarioInformadoG = input.nextDouble();

        Gerente gerente = new Gerente(nomeInformadoG, cpfInformadoG, salarioInformadoG);

        System.out.println("Informe o nome do diretor: ");
        String nomeInformadoD = input.next();
        System.out.println("Informe o cpf do diretor: ");
        String cpfInformadoD = input.next();
        System.out.println("Informe o salario do diretor: ");
        double salarioInformadoD = input.nextDouble();

        Diretor diretor = new Diretor(nomeInformadoD, cpfInformadoD, salarioInformadoD, gerente);

        System.out.println("Presidente: " + presidente.getBonificacao());
        System.out.println("Gerente: " + gerente.getBonificacao());
        System.out.println("Diretor" + diretor.getBonificacao());

    }
}
