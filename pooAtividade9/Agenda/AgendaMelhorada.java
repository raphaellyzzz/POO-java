package pooAtividade9.Agenda;

//Crie uma agenda que armazene o nome e telefone de um contato usando vetor. Utilize a classe Pessoa do exercício anterior com os atributos (nome e telefone - private) e métodos (adicionar, consultar, alterar e excluir contatos). Crie uma classe principal com um menu (1-adicionar contato, 2-consultar, 3-alterar contato, 4-excluir contato - 5-sair), use while para repetir até o usuário digitar 5-sair.

public class AgendaMelhorada {
    private String nome;
    private String telefone;

    public AgendaMelhorada(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String setNome(String nome){
        return this.nome;
    }
    public String setTelefone(String telefone){
        return this.telefone;
    }

    public void ImprimirContato() {
        System.out.println("Nome: " + nome + ", Telefone: " + telefone);
    }
}
