package PatronesDeComportamiento.Strategy;

public class AtaqueDesconocido implements AtaqueEstrategico{
    @Override
    public void atacar(Jugador jugador) {
        System.out.println(jugador.getNombre() + " la salud antes del ataque desconocido: " + jugador.getSalud());
        System.out.println("El desconocido esta atacando");
        jugador.setSalud(jugador.getSalud()-20);
        System.out.println(jugador.getNombre() + " la salud despues del ataque desconocido: " + jugador.getSalud());
    }
}
