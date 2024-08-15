package PatronesDeComportamiento.Command;

public class ComandoParaMoverHaciaLaIzquierda implements Comando{

    private Jugador jugador;

    public ComandoParaMoverHaciaLaIzquierda(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void ejecutar() {
        jugador.moverHaciaLaIzquierda();
    }
}
