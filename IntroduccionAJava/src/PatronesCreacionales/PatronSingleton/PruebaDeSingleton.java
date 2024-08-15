package PatronesCreacionales.PatronSingleton;

public class PruebaDeSingleton {
    public static void main(String[] args) {

        Thread hiloDeCarlos = new Thread(new CorreCarlos());
        Thread hiloDeManuel = new Thread(new CorreManuel());
        hiloDeCarlos.start();
        hiloDeManuel.start();

        // El patron singleton sirve para que el objeto
        // solo pueda ser instanciado una vez y que el primer
        // valor que le pasemos al momento de crear al objeto
        // ese sera durante todo el programa

//        Jugador jugador = Jugador.getJugador("Luis");
//        System.out.println(jugador);
//        jugador = Jugador.getJugador("Carlos");
//        System.out.println(jugador);
    }

    static class CorreCarlos implements Runnable {
        @Override
        public void run() {
            Jugador jugador = Jugador.getJugador("Carlos");
            System.out.println("Crea a Carlos: " + jugador);
        }
    }

    static class CorreManuel implements Runnable {
        @Override
        public void run() {
            Jugador jugador = Jugador.getJugador("Manuel");
            System.out.println("Crea a manuel: " + jugador);
        }
    }
}
