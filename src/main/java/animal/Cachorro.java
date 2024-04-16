package animal;

public class Cachorro extends Animal{

    @Override
    public void emitirSom(){
        System.out.println("LATIR");
    }

    public void abanarRabo(){
        System.out.println("Abana o rabo");
    }
}
