package PracticaDePatronesCreacionales.AbstractFactory;

public class VentanaDeAlertaMacOs extends VentanaDeAlerta {
    @Override
    public void mostrarAlerta() {
        System.out.println("Mac OS te advierte de algo, revisa");
    }
}
