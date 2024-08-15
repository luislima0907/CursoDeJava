package PatronesDeComportamiento.Strategy;

public class AtaqueMago implements AtaqueEstrategico{
    @Override
    public void atacar(Jugador jugador) {
        System.out.println(jugador.getNombre() + " la salud antes del ataque del mago: " + jugador.getSalud());
        System.out.println("El mago esta atacando");
        jugador.setSalud(jugador.getSalud()-20);
        System.out.println(jugador.getNombre() + " la salud despues del ataque del mago: " + jugador.getSalud());
    }
}
