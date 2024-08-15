package PatronesCreacionales.PatronSingleton;

public class Jugador {
    private String nombre;
    // una variable volatil intenta llegar primero al nucleo
    // principal de la memoria para recervar su espacio
    private static volatile Jugador jugador;

    private Jugador(String nombre) {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.nombre = nombre;
    }

    public static synchronized Jugador getJugador(String nombre) {
        if (jugador == null) {
            jugador = new Jugador(nombre);
        }
        return jugador;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
