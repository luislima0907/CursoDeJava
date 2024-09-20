package PracticaDePatronesCreacionales.AbstractFactory;

public class AppWindows extends App{
    @Override
    public VentanaDeAlerta crearVentanaDeAlerta() {
        return new VentanaDeAlertaWindows();
    }

    @Override
    public BotonAceptar crearBotonAceptar() {
        return new BotonAceptarWindows();
    }
}
