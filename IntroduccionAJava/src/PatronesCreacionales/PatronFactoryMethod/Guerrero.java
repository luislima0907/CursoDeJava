package PatronesCreacionales.PatronFactoryMethod;

public class Guerrero implements Enemigo {

    @Override
    public void atacar() {
        System.out.println("El guerrero ataca");
    }
}
