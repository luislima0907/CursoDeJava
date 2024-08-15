package PatronesDeComportamiento.Command;

public class ComandoParaMoverHaciaLaDerecha implements Comando{

    private Jugador jugador;

    public ComandoParaMoverHaciaLaDerecha(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void ejecutar() {
        jugador.moverHaciaLaDerecha();
    }
}
