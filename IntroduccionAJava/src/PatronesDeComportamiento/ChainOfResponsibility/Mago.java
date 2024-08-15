package PatronesDeComportamiento.ChainOfResponsibility;

public class Mago {

    private AtaqueElemental ataqueElemental;

    public Mago(AtaqueElemental ataqueElemental) {
        this.ataqueElemental = ataqueElemental;
    }

    public AtaqueElemental getAtaqueElemental() {
        return ataqueElemental;
    }

    public void setAtaqueElemental(AtaqueElemental ataqueElemental) {
        this.ataqueElemental = ataqueElemental;
    }

    public void atacarEnCadena(Jugador jugador) {
        System.out.println("Ataque al " + jugador.getTipoDeJugador().name().toLowerCase());
        ataqueElemental.atacar(jugador);
    }
}
