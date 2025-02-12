package inter;

public class Engenheiro extends Funcionario {

    public Engenheiro(String nome, String cpf, double salario) {
        super(salario, cpf, nome);
    }

    public void fazerProjeto() {
        System.out.println("Engenheiro está fazendo um projeto.");
    }

    @Override
    public void BaterPonto() {
        System.out.println("Engenheiro bateu o ponto.");
    }
}