package polimorfismo;

public class Main {
    public static void main(String[] args){
        Quadrado qua = new Quadrado("azul", 4);
        Quadrado quadra = new Quadrado("azul", 4, true);
        Circulo cir = new Circulo("vermelho", 3);
        Circulo circ = new Circulo("amarelo", "google", 5);

        cir.area(3);
        qua.area(4);
        
        System.out.println("Quadrado 1: cor = " + qua.getCor() + ", lado = " + qua.getLado());
        System.out.println("Quadrado 2: cor = " + quadra.getCor() + ", lado = " + quadra.getLado() + ", 3D = " + quadra.getD());
        System.out.println("Círculo 1: cor = " + cir.getCor() + ", raio = " + cir.getRaio());
        System.out.println("Círculo 2: cor = " + circ.getCor() + ", raio = " + circ.getRaio() + ", marca = " + circ.getMarca());
    }
}