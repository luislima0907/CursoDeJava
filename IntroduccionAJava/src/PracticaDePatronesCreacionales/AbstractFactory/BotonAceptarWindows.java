package PracticaDePatronesCreacionales.AbstractFactory;

public class BotonAceptarWindows extends BotonAceptar{
    @Override
    public void aceptar() {
        System.out.println("Gracias por ver el mensaje en Windows");
    }
}
