package PatronesDeComportamiento.Strategy;

public class PruebaStrategy {
    public static void main(String[] args) {
        Jugador primerJugador = new Jugador("Law");
        Enemigo primerEnemigo = new Enemigo("Barba negra");
        primerEnemigo.atacar(primerJugador);
        System.out.println("--------------");
        primerEnemigo.setAtaqueEstrategico(new AtaqueGuerrero());
        primerEnemigo.atacar(primerJugador);
        System.out.println("--------------");
        primerEnemigo.setAtaqueEstrategico(new AtaqueMago());
        primerEnemigo.atacar(primerJugador);
    }
}
