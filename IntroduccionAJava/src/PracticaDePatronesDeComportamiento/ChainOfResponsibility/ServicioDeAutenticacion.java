package PracticaDePatronesDeComportamiento.ChainOfResponsibility;

public class ServicioDeAutenticacion {
    private final Controlador manejador;

    public ServicioDeAutenticacion(Controlador controlador) {
        this.manejador = controlador;
    }

    public boolean iniciarSesion(String usuario, String clave) {
        if (manejador.contralador(usuario, clave)) {
            System.out.println("Autenticacion exitosa");
            return true;
        }
        return false;
    }
}
