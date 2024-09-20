package PracticaPatronesEstructurales.Flyweight;

import lombok.Data;

@Data
public class Libro {
    private final String titulo;
    private final double precio;
    private final TipoDeLibro tipo;

    public Libro(String titulo, double precio, TipoDeLibro tipo) {
        this.titulo = titulo;
        this.precio = precio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", tipo=" + tipo +
                '}';
    }
}
