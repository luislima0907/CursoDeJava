package PatronesEstructurales.Bridge.Luchador;

public class MagoLuchadorImplementado implements Luchador{

    @Override
    public void atacar() {
        System.out.println("El mago ataca");
    }

    @Override
    public void defender() {
        System.out.println("El mago se defiende");
    }
}
