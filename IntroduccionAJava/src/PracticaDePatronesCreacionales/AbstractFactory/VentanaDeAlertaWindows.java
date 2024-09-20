package PracticaDePatronesCreacionales.AbstractFactory;

public class VentanaDeAlertaWindows extends VentanaDeAlerta{
    @Override
    public void mostrarAlerta() {
        System.out.println("Windows te advierte algo, revisa");
    }
}
