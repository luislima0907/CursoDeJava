package PatronesDeComportamiento.ChainOfResponsibility;

public class Jugador {
    private TipoDeJugador tipoDeJugador;

    public Jugador(TipoDeJugador tipoDeJugador) {
        this.tipoDeJugador = tipoDeJugador;
    }

    public TipoDeJugador getTipoDeJugador() {
        return tipoDeJugador;
    }

    public void setTipoDeJugador(TipoDeJugador tipoDeJugador) {
        this.tipoDeJugador = tipoDeJugador;
    }
}
