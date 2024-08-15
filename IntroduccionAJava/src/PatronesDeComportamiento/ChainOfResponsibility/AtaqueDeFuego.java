package PatronesDeComportamiento.ChainOfResponsibility;

public class AtaqueDeFuego extends AtaqueElemental{

    public AtaqueDeFuego(AtaqueElemental siguiente) {
        super(siguiente);
    }

    public AtaqueDeFuego() {
    }

    @Override
    public void atacar(Jugador jugador) {
        if(jugador.getTipoDeJugador().equals(TipoDeJugador.VAMPIRO)){
            System.out.println("Ataque de Fuego");
        } else if (elSiguienteTiene()) {
            getSiguiente().atacar(jugador);
        } else {
            System.out.println("No se puede hacer el ataque de fuego");
        }
    }
}
