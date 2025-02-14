package polimorfismo;

public class Quadrado extends Figura{
    private String cor;
    private int lado;
    private boolean d;

    public Quadrado(){
    }

    public Quadrado(String cor, int lado, boolean d){
        this.cor = cor;
        this.lado = lado;
        this.d = d;
    }

    public Quadrado(String cor, int lado){
        this.cor = cor;
        this.lado = lado;
    }

    public void area(double l){
        double calculo = l * l;
        super.area(calculo);
    }

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public boolean getD() {
		return d;
	}

	public void setD(boolean d) {
		this.d = d;
	}
}
