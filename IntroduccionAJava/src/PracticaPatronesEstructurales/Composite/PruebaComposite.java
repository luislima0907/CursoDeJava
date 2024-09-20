package PracticaPatronesEstructurales.Composite;

public class PruebaComposite {
    public static void main(String[] args) {
        ServicioDeEntrega servicio = new ServicioDeEntrega();
        servicio.tomarPedido(new CajaCompuesta(
                new Videojuego("Halo 4", 100)),
                new Libro("One Piece", 200));
        System.out.println(servicio.calculcarPrecioDeLaCaja());
    }
}
