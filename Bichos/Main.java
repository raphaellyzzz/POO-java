package Bichos;

public class Main {
    public static void main(String[] args) {
        Cavalo cavalo = new Cavalo(1, "Preto", "Alala");
        Leao leao = new Leao(2, "Dourado", true);

        System.out.println("O cavalo");
        cavalo.comer();
        cavalo.fugir();

        System.out.println("-----------------");

        System.out.println("O Leão");
        leao.comer();
        leao.cacar();
    }
}
