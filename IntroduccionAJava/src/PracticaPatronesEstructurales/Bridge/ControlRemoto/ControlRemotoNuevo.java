package PracticaPatronesEstructurales.Bridge.ControlRemoto;

public class ControlRemotoNuevo implements ControlRemoto{
    @Override
    public void encender() {
        System.out.println("El control nuevo esta encendiendo el televisor");
    }

    @Override
    public void apagar() {
        System.out.println("El control nuevo esta apagando el televisor");
    }
}
