package PracticaDePatronesCreacionales.AbstractFactory;

public class AppMacOs extends App{
    @Override
    public VentanaDeAlerta crearVentanaDeAlerta() {
        return new VentanaDeAlertaMacOs();
    }

    @Override
    public BotonAceptar crearBotonAceptar() {
        return new BotonAceptarMacOs();
    }
}
