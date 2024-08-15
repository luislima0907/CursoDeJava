package PatronesDeComportamiento.Command;

public class ComandoParaMoverHaciaDelante implements Comando{
    private Jugador jugador;

    public ComandoParaMoverHaciaDelante(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void ejecutar() {
        jugador.moverHaciaDelante();
    }
}
