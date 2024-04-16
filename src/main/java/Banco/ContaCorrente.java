package Banco;

public class ContaCorrente extends ContaBancaria{
    private double tariMensal;

    public void defineTariMensal(double tariMensal) {
        this.tariMensal = tariMensal;
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public void cobrarTarifaMensal(){
        saldo -= tariMensal;
        System.out.println("Tafira mensal efetivada no valor de: "+ tariMensal+ "\n");
    }
}
