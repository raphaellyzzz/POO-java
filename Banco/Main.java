package Banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Conta> contas = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:" +
                    "\n 1 - Criar Cliente" +
                    "\n 2 - Criar Conta" +
                    "\n 3 - Criar Poupança" +
                    "\n 4 - Depositar" +
                    "\n 5 - Consultar Saldo"+
                    "\n 6 - Transferir" +
                    "\n 7 - Render Juros"+
                    "\n 8 - Sair"
            );
            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do cliente: ");
                    String nome = input.next();
                    System.out.print("CPF do cliente: ");
                    String cpf = input.next();
                    clientes.add(new Cliente(nome, cpf));
                    System.out.println("Cliente criado.");
                    break;

                case 2:
                    System.out.print("Número da conta: ");
                    int numeroConta = input.nextInt();
                    System.out.print("Saldo: ");
                    double saldoConta = input.nextDouble();
                    System.out.print("CPF do cliente: ");
                    String cpfConta = input.next();
                    Cliente clienteConta = null;
                    for (Cliente c : clientes) {
                        if (c.getCpf().equals(cpfConta)) {
                            clienteConta = c;
                            break;
                        }
                    }
                    if (clienteConta != null) {
                        Conta conta = new Conta(numeroConta, saldoConta);
                        conta.setCliente(clienteConta);
                        contas.add(conta);
                        System.out.println("Conta criada.");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Número da poupança: ");
                    int numeroPoupanca = input.nextInt();
                    System.out.print("Saldo: ");
                    double saldoPoupanca = input.nextDouble();
                    System.out.print("Juros (%): ");
                    double juros = input.nextDouble();
                    System.out.print("CPF do cliente: ");
                    String cpfPoupanca = input.next();
                    Cliente clientePoupanca = null;
                    for (Cliente c : clientes) {
                        if (c.getCpf().equals(cpfPoupanca)) {
                            clientePoupanca = c;
                            break;
                        }
                    }
                    if (clientePoupanca != null) {
                        Poupanca poupanca = new Poupanca(numeroPoupanca, saldoPoupanca, juros);
                        poupanca.setCliente(clientePoupanca);
                        contas.add(poupanca);
                        System.out.println("Poupança criada.");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Número da conta: ");
                    int numeroContaDeposito = input.nextInt();
                    Conta contaDeposito = null;
                    for (Conta c : contas) {
                        if (c.getNumero() == numeroContaDeposito) {
                            contaDeposito = c;
                            break;
                        }
                    }
                    if (contaDeposito != null) {
                        System.out.print("Valor do depósito: ");
                        double valor = input.nextDouble();
                        contaDeposito.depositar(valor);
                        System.out.println("Depósito realizado.");
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 5:
                    System.out.print("Número da conta: ");
                    int numeroContaConsulta = input.nextInt();
                    Conta contaConsulta = null;
                    for (Conta c : contas) {
                        if (c.getNumero() == numeroContaConsulta) {
                            contaConsulta = c;
                            break;
                        }
                    }
                    if (contaConsulta != null) {
                        contaConsulta.consultarSaldo();
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 6:
                    System.out.print("Número da conta origem: ");
                    int numeroOrigem = input.nextInt();
                    Conta contaOrigem = null;
                    for (Conta c : contas) {
                        if (c.getNumero() == numeroOrigem) {
                            contaOrigem = c;
                            break;
                        }
                    }
                    if (contaOrigem != null) {
                        System.out.print("Número da conta destino: ");
                        int numeroDestino = input.nextInt();
                        Conta contaDestino = null;
                        for (Conta c : contas) {
                            if (c.getNumero() == numeroDestino) {
                                contaDestino = c;
                                break;
                            }
                        }
                        if (contaDestino != null) {
                            System.out.print("Qual o valor da transferência? ");
                            double valorTransferir = input.nextDouble();
                            contaOrigem.transferir(valorTransferir, contaDestino);
                            System.out.println("Transferência realizada.");
                        } else {
                            System.out.println("Conta destino não encontrada.");
                        }
                    } else {
                        System.out.println("Conta origem não encontrada.");
                    }
                    break;

                case 7:
                    System.out.print("Número da conta poupança: ");
                    int numeroPoupancaJuros = input.nextInt();
                    Conta contaJuros = null;
                    for (Conta c : contas) {
                        if (c.getNumero() == numeroPoupancaJuros) {
                            contaJuros = c;
                            break;
                        }
                    }
                    if (contaJuros instanceof Poupanca) {
                        System.out.print("Juros a aplicar (%): ");
                        double taxaJuros = input.nextDouble();
                        ((Poupanca) contaJuros).renderJuros(taxaJuros);
                        System.out.println("Juros aplicados.");
                    } else {
                        System.out.println("Conta poupança não encontrada.");
                    }
                    break;

                case 8:
                    System.out.println("Saindo do programa");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 8);

        input.close();
    }
}
