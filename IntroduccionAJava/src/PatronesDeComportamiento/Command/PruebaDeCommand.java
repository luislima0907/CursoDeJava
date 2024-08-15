package PatronesDeComportamiento.Command;

import java.util.Scanner;

public class PruebaDeCommand {
    public static void main(String[] args) {
        Jugador jugador = new Jugador(0,0,0);
        InvocadorDeMovimiento invocadorDeMovimiento = new InvocadorDeMovimiento(jugador);

        Scanner sc = new Scanner(System.in);
        char c = sc.next().trim().toLowerCase().charAt(0);

        while (c != 'q'){
            invocadorDeMovimiento.mover(c);
            c = sc.next().trim().toLowerCase().charAt(0);
        }
    }
}
