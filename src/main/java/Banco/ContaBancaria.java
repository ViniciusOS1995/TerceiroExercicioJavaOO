package Banco;

public class ContaBancaria {
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    protected double saldo;


    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito realizado com suceeso:");
        System.out.println("Seu saldo agora é: " + saldo+ "\n");
    }

    public void sacar(double valor){
        saldo -= valor;
        System.out.println("Saque realizado com suceeso:");
        System.out.println("Seu saldo agora é: " + saldo+"\n");
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo agora é: "+ saldo+"\n");
    }
}
