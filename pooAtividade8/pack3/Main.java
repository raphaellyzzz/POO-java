package pooAtividade8.pack3;

//Dado o vetor={1,2,3,4,5,6} informe quais os números são pares e ímpares (imprimir).

public class Main {
    public static void main(String[] args){
        int [] numeros = {1,2,3,4,5,6};

        for (int n: numeros){
            if (n % 2 ==0){
                System.out.println("O número " + n +" é IMPAR");
            }else{
                System.out.println("O número " + n +" é PAR");
            }
        }

//        int[] numeros = new int[6];
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < 6; i++){
//            System.out.println("Digite o numero:");
//            int n = input.nextInt();
//
//            numeros[i] = n;
//
//            if (numeros[n] % 2 == 0){
//                System.out.println("Os pares são: " + numeros[n]);
//            }else{
//                System.out.println("Os impares são: " + numeros[n]);
//            }
//        }
    }
}
