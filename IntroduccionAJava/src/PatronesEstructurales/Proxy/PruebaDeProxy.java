package PatronesEstructurales.Proxy;

public class PruebaDeProxy {
    public static void main(String[] args) {
        JuegoImplementado juego = new JuegoImplementado();
        juego.nuevaPartida("Luis");
        ProxyJuegoImplementado proxyJuego = new ProxyJuegoImplementado(juego);
        proxyJuego.cargar("Luis");
        System.out.println(proxyJuego.getEstados());
        proxyJuego.getEstados().setKills(10);
        proxyJuego.getEstados().setDeaths(2);
        proxyJuego.getEstados().setNivel(10);
        proxyJuego.guardar("Luis");
        proxyJuego.cargar("Luis");
        System.out.println(proxyJuego.getEstados());
    }
}
