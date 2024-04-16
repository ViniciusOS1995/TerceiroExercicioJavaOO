package Veiculo;

public class Carro {
    public Carro(String modelo, double precoAno1, double precoAno2, double precoAno3) {
        this.modelo = modelo;
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public double calcularmenorPreco(){
        double menorPreco = precoAno1;
        if(menorPreco > precoAno2){
            menorPreco = precoAno2;
        }
        if (menorPreco > precoAno3){
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    public void mostraInfo(){
        System.out.println("Informações sobre o Carro pesquisado:");
        System.out.println("Modelo: "+ modelo);
        System.out.println("Preço geração 1: "+ precoAno1);
        System.out.println("Preço geração 2: "+ precoAno2);
        System.out.println("Preço geração 3: "+ precoAno3);
    }



}
