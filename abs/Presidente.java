package abs;

public class Presidente extends Funcionario{
    public Presidente(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao(){
        return (this.salario * 50) / 100;
    }
}
