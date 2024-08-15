package PatronesDeComportamiento.Observer;

public interface MiObservable {
    public void suscribe(MiObservador observador);
    public void desuscribirse(MiObservador observador);
    public void enviarMensaje();

}
