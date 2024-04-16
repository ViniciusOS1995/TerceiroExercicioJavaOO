package nPrimos;

public class Principal {
    public static void main(String[] args) {
        var verificador = new VerificadorPrimo();
        verificador.verificarSeEPrimo(17);

        var gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: "+ proximoPrimo);

        var numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
