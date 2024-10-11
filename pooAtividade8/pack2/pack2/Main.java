package pooAtividade8.pack2.pack2;
import pooAtividade8.pack2.pack1.*;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Ari", "000.000.000-00", 2004, 1.64);
        Pessoa pessoa2 = new Pessoa("Ricson Santana", "111.111.111-11", 1982, 1.77);
        System.out.println("Imprimindo os dados... ");
        pessoa1.ImprimirDados();
        pessoa2.ImprimirDados();

        //System.out.println(pessoa1.getNome()); usando o get
    }
}
