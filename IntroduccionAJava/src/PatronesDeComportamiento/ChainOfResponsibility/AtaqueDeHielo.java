package PatronesDeComportamiento.ChainOfResponsibility;

public class AtaqueDeHielo extends AtaqueElemental{

    public AtaqueDeHielo(AtaqueElemental siguiente) {
        super(siguiente);
    }

    public AtaqueDeHielo() {
    }

    @Override
    public void atacar(Jugador jugador) {
        if(jugador.getTipoDeJugador().equals(TipoDeJugador.GUERRERO)){
            System.out.println("Ataque de Hielo");
        } else if (elSiguienteTiene()) {
            getSiguiente().atacar(jugador);
        } else {
            System.out.println("No se puede atacar con hielo");
        }
    }
}
