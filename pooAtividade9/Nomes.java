package pooAtividade9;

import java.util.ArrayList;

public class Nomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("José");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}