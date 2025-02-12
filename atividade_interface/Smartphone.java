package atividade_interface;

public class Smartphone implements Radio, GPS, Calculadora {
    @Override
    public void estacao(String estacao) {
        System.out.println("sintonizando na estação: " + estacao);
    }

    @Override
    public void coordenadas(double latitude, double longitude) {
        System.out.println("coordenadas: latitude " + latitude + ", longitude " + longitude);
    }

    @Override
    public float somar(float a, float b) {
        return a + b;
    }

    @Override
    public float dividir(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("erro: divisão por zero!");
            return 0;
        }
    }
}
