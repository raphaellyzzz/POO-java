package abs;

abstract class Funcionario {
    public String nome;
    public String cpf;
    public double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract double getBonificacao();

}
