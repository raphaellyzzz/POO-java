package Polimorfismo;

public class Quadrado extends Figura{
    @Override
    public void Area(double lado){
        double calculo = lado * lado;
        super.Area(calculo);
    }
}
