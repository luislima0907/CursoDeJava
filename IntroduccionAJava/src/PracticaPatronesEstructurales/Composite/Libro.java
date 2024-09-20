package PracticaPatronesEstructurales.Composite;

public class Libro extends Producto{


    public Libro(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularPrecio() {
        return getPrecio();
    }
}
