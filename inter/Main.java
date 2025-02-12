package inter;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(500, "12345678900", "Maria");
        Diretor diretor = new Diretor("João", "98765432100", 17500);
        Engenheiro engenheiro = new Engenheiro("Pedro", "56473829100", 4000);
        Gerente gerente = new Gerente("Ana", "11223344556", 12000);
        Secretario secretario = new Secretario("Lucas", "55667788990", 2000);

        cliente.autenticar(1);
        cliente.ComprarPontos();

        diretor.autenticar(2);
        diretor.comprarAcoes();
        diretor.BaterPonto();
        diretor.ConsultarSalario();

        engenheiro.BaterPonto();
        engenheiro.fazerProjeto();

        gerente.autenticar(3);
        gerente.gerenciarEquipe();
        gerente.BaterPonto();

        secretario.BaterPonto();
        secretario.ConsultarAgenda();
    }
}