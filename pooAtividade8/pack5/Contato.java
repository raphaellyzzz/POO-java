package pooAtividade8.pack5;

//Crie uma agenda que armazene o nome e telefone de um contato. Crie uma classe Contato com os atributos (nome e telefone - private) e métodos (adicionar, consultar, alterar e excluir contatos). Crie uma classe principal com um menu (1-adicionar contato, 2-consultar, 3-alterar contato, 4-excluir contato - 5-sair), use while para repetir até o usuário digitar 5-sair.

import java.util.Scanner;

public class Contato {
    private String nome;
    private String telefone;

    Scanner input = new Scanner(System.in);

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void Adicionar(){
        System.out.println("Digite o nome:");
        nome = input.next();
        System.out.println("Digite o telefone:");
        telefone = input.next();
    }

    public void Consultar(){
        System.out.println("Digite o nome do contato que vai ser consultado:");
        String consulta = input.next();
    }

    public void Alterar(){
        System.out.println("Digite o nome do contato que vai ser alterado:");
        String nome_alterado = input.next();
        System.out.println("Digite o telefone:");
        telefone = input.next();
    }

    public void Excluir(){
        
    }


}
