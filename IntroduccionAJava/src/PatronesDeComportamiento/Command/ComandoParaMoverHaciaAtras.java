package PatronesDeComportamiento.Command;

public class ComandoParaMoverHaciaAtras implements Comando{

    private Jugador jugador;

    public ComandoParaMoverHaciaAtras(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void ejecutar() {
        jugador.moverHaciaAtras();
    }
}
