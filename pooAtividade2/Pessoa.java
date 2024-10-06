package pooAtividade2;

public class Pessoa {
	String nome;
    String dataNasc;
    String cpf;

    public Pessoa(String nome, String dataNascimento, String cpf) {
        this.nome = nome;
        this.dataNasc = dataNascimento;
        this.cpf = cpf;
    }

    public void acordar() {
        System.out.println("Acordar");
    }


    public void comer() {
        System.out.println("Comer");
    }

    public void dormir() {
        System.out.println("Dormir");
    }
}
