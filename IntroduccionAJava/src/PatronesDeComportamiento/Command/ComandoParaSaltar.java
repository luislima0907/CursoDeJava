package PatronesDeComportamiento.Command;

public class ComandoParaSaltar implements Comando{

    private Jugador jugador;

    public ComandoParaSaltar(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void ejecutar() {
        jugador.saltar();
    }
}
