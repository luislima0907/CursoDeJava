package PracticaDePatronesDeComportamiento.ChainOfResponsibility;

public abstract class Controlador {
    private Controlador siguiente;

    public Controlador setSiguienteControlador(Controlador controlador) {
        this.siguiente = controlador;
        return controlador;
    }

    public abstract boolean contralador(String nombreDeUsuario, String clave);

    protected boolean siguienteControlador(String nombreDeUsuario, String clave) {
        if (this.siguiente == null) {
            return true;
        }
        return this.siguiente.contralador(nombreDeUsuario, clave);
    }
}
