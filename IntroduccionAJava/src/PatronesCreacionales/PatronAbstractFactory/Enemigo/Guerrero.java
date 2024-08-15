package PatronesCreacionales.PatronAbstractFactory.Enemigo;

public class Guerrero implements Enemigo{
    @Override
    public void atacar() {
        System.out.println("El guerrero ataca");
    }
}
