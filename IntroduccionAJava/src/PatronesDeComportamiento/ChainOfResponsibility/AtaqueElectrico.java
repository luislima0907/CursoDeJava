package PatronesDeComportamiento.ChainOfResponsibility;

public class AtaqueElectrico extends AtaqueElemental{

    public AtaqueElectrico(AtaqueElemental siguiente) {
        super(siguiente);
    }

    public AtaqueElectrico() {
    }

    @Override
    public void atacar(Jugador jugador) {
        if(jugador.getTipoDeJugador().equals(TipoDeJugador.MAGO)){
            System.out.println("Ataque electrico");
        } else if (elSiguienteTiene()) {
            getSiguiente().atacar(jugador);
        } else {
            System.out.println("No se puede hacer el ataque electrico");
        }
    }
}
