package PracticaDePatronesCreacionales.AbstractFactory;

public class PruebaAbstractFactory {
    public static void main(String[] args) {
        System.out.println("WINDOWS");
        App appWindows = new AppWindows();
        VentanaDeAlerta ventanaWindows = appWindows.crearVentanaDeAlerta();
        BotonAceptar botonWindows = appWindows.crearBotonAceptar();

        ventanaWindows.mostrarAlerta();
        botonWindows.aceptar();
        System.out.println("MAC OS");
        App appMacOs = new AppMacOs();
        VentanaDeAlerta ventanaMacOs = appMacOs.crearVentanaDeAlerta();
        BotonAceptar botonMacOs = appMacOs.crearBotonAceptar();
        ventanaMacOs.mostrarAlerta();
        botonMacOs.aceptar();
    }
}
