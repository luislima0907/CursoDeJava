package PracticaPatronesEstructurales.Composite;

public class Videojuego extends Producto{
    public Videojuego(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularPrecio() {
        return getPrecio();
    }
}
