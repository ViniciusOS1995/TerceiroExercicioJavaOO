package Veiculo;

public class ModeloCarro extends Carro{
    public ModeloCarro(String modelo, double precoAno1, double precoAno2, double precoAno3) {
        super(modelo, precoAno1, precoAno2, precoAno3);
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Gol", 12000.00, 17000.00, 22000.00);
        carro1.mostraInfo();
        System.out.println("O modelo com o menor preço é:"+ carro1.calcularmenorPreco());

    }
}
