package PatronesEstructurales.PatronAdapter;

public class Mago implements Enemigo{
    @Override
    public void atacar() {
        System.out.println("El mago esta atacando");
    }

    @Override
    public void danio() {
        System.out.println("El mago esta haciendo danio");
    }
}
