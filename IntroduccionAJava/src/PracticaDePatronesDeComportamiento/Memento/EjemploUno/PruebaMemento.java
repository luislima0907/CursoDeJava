package PracticaDePatronesDeComportamiento.Memento.EjemploUno;

public class PruebaMemento {
    public static void main(String[] args) {
        String nombreDelJuego = "Halo 4";
        Juego juego = new Juego(nombreDelJuego,1,0);
        juego.guardar();
        System.out.println("Guardardo 1: " + juego);
        juego = new Juego(nombreDelJuego,2,10);
        juego.guardar();
        System.out.println("Guardardo 2: " + juego);
        System.out.println("----------------");
        juego = new Juego(nombreDelJuego);
        juego.deshacer();
        System.out.println("Deshacer punto de control 1: " + juego);
        System.out.println("----------------");
        juego = new Juego(nombreDelJuego);
        juego.rehacer();
        System.out.println("Rehacer punto de control 1: " + juego);
    }
}
