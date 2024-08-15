package PatronesEstructurales.Bridge.Luchador;

public class GuerreroLuchadorImplementado implements Luchador{
    @Override
    public void atacar() {
        System.out.println("El guerrero ataca");
    }

    @Override
    public void defender() {
        System.out.println("El guerrero se defiende");
    }
}
