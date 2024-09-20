package PracticaDePatronesDeComportamiento.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableEstacionDeTiempo implements Observable{
    private List<Observador> observadores;
    private String nombre;
    private int temperatura;

    public ObservableEstacionDeTiempo(String nombre, int temperatura) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        observadores = new ArrayList<>();
    }

    public int getTemperatura(){
        return this.temperatura;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public void agregar(Observador observador) {
        this.observadores.add(observador);
    }

    @Override
    public void remover(Observador observador) {
        this.observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : this.observadores) {
            observador.actualizar();
        }
    }
}
