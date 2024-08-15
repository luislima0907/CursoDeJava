package PatronesDeComportamiento.Observer;

import java.util.ArrayList;
import java.util.List;

public class Vigilante extends Enemigo implements MiObservable{

    private List<MiObservador> listaDeObservadores = new ArrayList<>();

    public Vigilante(String nombre) {
        super(nombre);
        setEstado(true);
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + "El Vigilante esta atacando");
    }

    @Override
    public void activar() {
        System.out.println(getNombre() + " enviando mensajes");
        enviarMensaje();
    }

    @Override
    public void suscribe(MiObservador observador) {
        listaDeObservadores.add(observador);
    }

    @Override
    public void desuscribirse(MiObservador observador) {
        listaDeObservadores.remove(observador);
    }

    @Override
    public void enviarMensaje() {
        for (MiObservador observador : listaDeObservadores) {
            observador.actualizar();
        }
    }
}
