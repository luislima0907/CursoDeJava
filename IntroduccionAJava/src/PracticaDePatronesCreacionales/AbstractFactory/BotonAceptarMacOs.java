package PracticaDePatronesCreacionales.AbstractFactory;

public class BotonAceptarMacOs extends BotonAceptar {
    @Override
    public void aceptar() {
        System.out.println("Gracias por ver el mensaje en Mac Os");
    }
}
