package PatronesCreacionales.PatronAbstractFactory.Enemigo;

public class Mago implements Enemigo {

    @Override
    public void atacar() {
        System.out.println("El mago ataca");
    }
}
