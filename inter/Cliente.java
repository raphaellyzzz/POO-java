package inter;

public class Cliente implements Autenticavel {
    private double renda;
    private String cpf;
    private String nomeCliente;

    public Cliente() {}

    public Cliente(double renda, String cpf, String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.renda = renda;
        this.cpf = cpf;
    }

    public void ComprarPontos() {
        System.out.println("Cliente está comprando pontos.");
    }

    @Override
    public void autenticar(int id) {
        System.out.println("Autenticando Cliente...");
    }
}