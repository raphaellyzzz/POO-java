package pooAtividade8.pack5;

//Crie uma agenda que armazene o nome e telefone de um contato. Crie uma classe Contato com os atributos (nome e telefone - private) e métodos (adicionar, consultar, alterar e excluir contatos). Crie uma classe principal com um menu (1-adicionar contato, 2-consultar, 3-alterar contato, 4-excluir contato - 5-sair), use while para repetir até o usuário digitar 5-sair.

import java.util.Scanner;

public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void imprimirContato() {
        System.out.println("Nome: " + nome + ", Telefone: " + telefone);
    }

}
