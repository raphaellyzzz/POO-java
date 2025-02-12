package inter;

public class Diretor extends Funcionario implements Autenticavel {

    public Diretor(String nome, String cpf, double salario) {
        super(salario, cpf, nome);
    }

    public void comprarAcoes() {
        System.out.println("Diretor comprando ações.");
    }

    @Override
    public void autenticar(int id) {
        System.out.println("Autenticando Diretor...");
    }

    @Override
    public void BaterPonto() {
        System.out.println("Diretor bateu o ponto.");
    }
}