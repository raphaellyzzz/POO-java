package Polimorfismo;

public class Circulo extends Figura{
    @Override
    public void Area(double raio){
        double calculo = 3.14 * raio * raio;
        super.Area(calculo);
    }
}
