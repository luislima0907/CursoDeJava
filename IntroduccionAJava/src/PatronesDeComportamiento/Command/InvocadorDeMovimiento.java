package PatronesDeComportamiento.Command;

import java.util.HashMap;

public class InvocadorDeMovimiento {
    private HashMap<Character, Comando> comandos = new HashMap<>();
    private Jugador jugador;

    public InvocadorDeMovimiento(Jugador jugador) {
        this.jugador = jugador;
        comandos.put('w', new ComandoParaMoverHaciaDelante(jugador));
        comandos.put('s', new ComandoParaMoverHaciaAtras(jugador));
        comandos.put('d', new ComandoParaMoverHaciaLaDerecha(jugador));
        comandos.put('a', new ComandoParaMoverHaciaLaIzquierda(jugador));
        comandos.put('j', new ComandoParaSaltar(jugador));
    }

    public void mover(char c){
        if(!comandos.containsKey(c)){
            System.out.println("El comando no existe");
        } else {
            comandos.get(c).ejecutar();
        }
    }
}
