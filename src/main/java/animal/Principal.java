package animal;

public class Principal {
    public static void main(String[] args) {
        var cachorro = new Cachorro();
        var gato = new Gato();

        cachorro.emitirSom();
        cachorro.abanarRabo();

        gato.emitirSom();
        gato.arranharMoveis();
    }
}
