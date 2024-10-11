package pooAtividade9.Agenda;

import java.util.ArrayList;
import java.util.Scanner;

//Crie uma agenda que armazene o nome e telefone de um contato usando vetor. Utilize a classe Pessoa do exercício anterior com os atributos (nome e telefone - private) e métodos (adicionar, consultar, alterar e excluir contatos). Crie uma classe principal com um menu (1-adicionar contato, 2-consultar, 3-alterar contato, 4-excluir contato - 5-sair), use while para repetir até o usuário digitar 5-sair.

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<AgendaMelhorada> agenda = new ArrayList<>();

        int opcao = 0;

        do {
            System.out.println("Escolha uma opção:" +
                    "\n 1 - Adicionar Contato" +
                    "\n 2 - Consultar Contato" +
                    "\n 3 - Alterar Contato" +
                    "\n 4 - Excluir Contato" +
                    "\n 5 - Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = input.next();
                    System.out.print("Digite o telefone: ");
                    String telefone = input.next();
                    AgendaMelhorada contato = new AgendaMelhorada(nome, telefone);
                    agenda.add(contato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome do contato para consulta: ");
                    String nomeConsulta = input.next();
                    boolean encontrado = false;
                    for (AgendaMelhorada ctt: agenda) {
                        if (ctt.getNome().equalsIgnoreCase(nomeConsulta)) {
                            ctt.ImprimirContato();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contato não foi encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do contato a alterar: ");
                    String nomeAlterar = input.next();
                    boolean alterado = false;
                    for (AgendaMelhorada ctt: agenda) {
                        if (ctt.getNome().equalsIgnoreCase(nomeAlterar)) {
                            System.out.print("Digite o novo nome: ");
                            String novoNome = input.next();
                            System.out.print("Digite o novo telefone: ");
                            String novoTelefone = input.next();
                            ctt.setNome(novoNome);
                            ctt.setTelefone(novoTelefone);
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
                    for (int i = 0; i < agenda.size(); i++) {
                        if (agenda.get(i).getNome().equalsIgnoreCase(nomeExcluir)) {
                            agenda.remove(i);
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
                    System.out.println("Saindo do programa");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }while (opcao != 5);
        input.close();
    }
}
