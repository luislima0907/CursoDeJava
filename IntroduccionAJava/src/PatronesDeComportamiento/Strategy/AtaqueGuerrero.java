package PatronesDeComportamiento.Strategy;

public class AtaqueGuerrero implements AtaqueEstrategico{
    @Override
    public void atacar(Jugador jugador) {
        System.out.println(jugador.getNombre() + " la salud antes del ataque del guerrero: " + jugador.getSalud());
        System.out.println("El guerrero esta atacando");
        jugador.setSalud(jugador.getSalud()-20);
        System.out.println(jugador.getNombre() + " la salud despues del ataque del guerrero: " + jugador.getSalud());
    }
}
