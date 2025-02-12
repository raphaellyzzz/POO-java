package prova.Principal;

import prova.conta.ContaCorrente;
import prova.conta.ContaPoupanca;
import prova.negocios.SeguroDeVida;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("145", "pessoa1", 5000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("225", "pessoa2", 5000, 10);
        SeguroDeVida seguroDeVida = new SeguroDeVida("336", "pessoa 3", 6000);

        // metodos conta corrente
        contaCorrente.depositar(100);
        contaCorrente.sacar(50);
        contaCorrente.obterSaldo();
        contaCorrente.calcularTributos();

        // metodos conta poupanca
        contaPoupanca.depositar(100);
        contaPoupanca.sacar(50);
        contaPoupanca.obterSaldo();
        contaPoupanca.renderJuros(5);

        // metodos seguro de vida
        seguroDeVida.emitirApolice();
        seguroDeVida.calcularTributos();

        System.out.println("O saldo final da conta corrente foi: " + contaCorrente.getSaldo());
        System.out.println("O saldo final da conta poupança foi: " + contaPoupanca.getSaldo());
        System.out.println("O valor do seguro de vida foi: " + seguroDeVida.getValor());


    }
}
