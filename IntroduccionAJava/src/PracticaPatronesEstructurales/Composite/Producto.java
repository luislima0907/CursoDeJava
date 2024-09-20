package PracticaPatronesEstructurales.Composite;

import lombok.Data;

@Data
public abstract class Producto implements Caja{
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
