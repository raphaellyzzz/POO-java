package inter;

public abstract class Funcionario {
    private double salario;
    private String cpf;
    private String nome;

    public Funcionario() {}

    public Funcionario(double salario, String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void BaterPonto();

    public void ConsultarSalario() {
        System.out.println("O salário é: " + salario);
    }

    public double getSalario() {
        return salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
