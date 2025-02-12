package inter;

public class Gerente extends Funcionario implements Autenticavel {

    public Gerente(String nome, String cpf, double salario) {
        super(salario, cpf, nome);
    }

    public void gerenciarEquipe() {
        System.out.println("Gerente está gerenciando a equipe.");
    }

    @Override
    public void autenticar(int id) {
        System.out.println("Autenticando Gerente...");
    }

    @Override
    public void BaterPonto() {
        System.out.println("Gerente bateu o ponto.");
    }
}