package PracticaPatronesEstructurales.Bridge.ControlRemoto;

public class ControlRemotoViejo implements ControlRemoto{
    @Override
    public void encender() {
        System.out.println("El control viejo esta encendiendo el televisor");
    }

    @Override
    public void apagar() {
        System.out.println("El control viejo esta apagando el televisor");
    }
}
