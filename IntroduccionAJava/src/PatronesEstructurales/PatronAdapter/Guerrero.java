package PatronesEstructurales.PatronAdapter;

public class Guerrero implements Enemigo{

    @Override
    public void atacar() {
        System.out.println("El guerrero esta atacando");
    }

    @Override
    public void danio() {
        System.out.println("El guerrero esta haciendo danio");
    }
}
