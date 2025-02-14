package polimorfismo;

public class Circulo extends Figura{
    private String marca;
    private double raio;
    private String cor;

    public Circulo(){

    }

    public Circulo(String cor, String marca, double raio){
        this.cor = cor;
        this.marca = marca;
        this.raio = raio;
    }

    public Circulo(String cor, double raio){
        this.cor = cor;
        this.raio = raio;
    }

    public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void area(double r){
        double calculo = 3.14 * r * r;
        super.area(calculo);
    }
}