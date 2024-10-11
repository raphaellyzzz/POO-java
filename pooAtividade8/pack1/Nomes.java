package pooAtividade8.pack1;

//um vetor com os nomes {“João”,”Maria”,”José”}. Imprima os valores do vetor.

public class Nomes {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Joao";
        nomes[1] = "Maria";
        nomes[2] = "José";


        //for (String n: nomes){
        //    System.out.println(n);
        //} outro tipo de for

        for (int i = 0; i<3; i++){
            System.out.println(nomes[i]);
        }

    }


}
