package PatronesCreacionales.PatronFactory;

public class Guerrero implements Enemigo{

    @Override
    public void atacar() {
        System.out.println("El guerreo ataca");
    }
}
