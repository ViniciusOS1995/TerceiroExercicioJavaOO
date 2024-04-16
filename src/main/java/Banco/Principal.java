package Banco;

public class Principal {
    public static void main(String[] args) {
        var contaCorrente = new ContaCorrente(800);
        contaCorrente.consultarSaldo();
        contaCorrente.defineTariMensal(14);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(250);
        contaCorrente.depositar(1000);
    }
}
