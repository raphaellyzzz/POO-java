package inter;

public class Secretario extends Funcionario {

    public Secretario(String nome, String cpf, double salario) {
        super(salario, cpf, nome);
    }

    public void ConsultarAgenda() {
        System.out.println("Secretário consultando a agenda.");
    }

    @Override
    public void BaterPonto() {
        System.out.println("Secretário bateu o ponto.");
    }
}