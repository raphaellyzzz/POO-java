package abs;

public class Gerente extends Funcionario{
    public Gerente(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao(){
        return (this.salario * 30) / 100;
    }

}
