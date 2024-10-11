package pooAtividade8.pack5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Contato[] agenda = new Contato[100];

        int quantidadeContatos = 0;
        int opcao = 0;

        do {
            System.out.println("\nEscolha uma opção:" +
                    "\n 1 - Adicionar Contato" +
                    "\n 2 - Consultar Contato" +
                    "\n 3 - Alterar Contato" +
                    "\n 4 - Excluir Contato" +
                    "\n 5 - Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    if (quantidadeContatos < agenda.length) {
                        System.out.print("Digite o nome: ");
                        String nome = input.next();
                        System.out.print("Digite o telefone: ");
                        String telefone = input.next();
                        agenda[quantidadeContatos] = new Contato(nome, telefone);
                        quantidadeContatos++;
                        System.out.println("Contato adicionado com sucesso");
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome do contato para consulta: ");
                    String nomeConsulta = input.next();
                    boolean encontrado = false;
                    for (int i = 0; i < quantidadeContatos; i++) {
                        if (agenda[i].getNome().equalsIgnoreCase(nomeConsulta)) {
                            agenda[i].imprimirContato();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do contato para alterar: ");
                    String nomeAlterar = input.next();
                    boolean alterado = false;
                    for (int i = 0; i < quantidadeContatos; i++) {
                        if (agenda[i].getNome().equalsIgnoreCase(nomeAlterar)) {
                            System.out.print("Digite o novo nome: ");
                            String novoNome = input.next();
                            System.out.print("Digite o novo telefone: ");
                            String novoTelefone = input.next();
                            agenda[i].setNome(novoNome);
                            agenda[i].setTelefone(novoTelefone);
                            System.out.println("Contato alterado com sucesso!");
                            alterado = true;
                            break;
                        }
                    }
                    if (!alterado) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do contato a excluir: ");
                    String nomeExcluir = input.next();
                    boolean excluido = false;
                    for (int i = 0; i < quantidadeContatos; i++) {
                        if (agenda[i].getNome().equalsIgnoreCase(nomeExcluir)) {
                            for (int j = i; j < quantidadeContatos - 1; j++) {
                                agenda[j] = agenda[j + 1]; //logica de retirar contato da lista
                            }
                            agenda[quantidadeContatos - 1] = null;
                            quantidadeContatos--;
                            System.out.println("Contato excluído com sucesso!");
                            excluido = true;
                            break;
                        }
                    }
                    if (!excluido) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 5);

        input.close();
    }
}
