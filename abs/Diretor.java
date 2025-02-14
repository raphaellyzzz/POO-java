package abs;

public class Diretor extends Gerente{
    public Gerente gerente;

    public Diretor(String nome, String cpf, double salario, Gerente gerente){
        super(nome, cpf, salario);
        this.gerente = gerente;
    }

    @Override
    public double getBonificacao(){
        return this.gerente.getBonificacao();
    }
}
