package PatronesDeComportamiento.ChainOfResponsibility;

public class PruebaDeChainOfResponsibility {
    public static void main(String[] args) {
        Jugador jugador = new Jugador(TipoDeJugador.VAMPIRO);
        Mago mago = new Mago(new AtaqueDeFuego(new AtaqueDeHielo(new AtaqueElectrico())));
        mago.atacarEnCadena(jugador);
    }
}
