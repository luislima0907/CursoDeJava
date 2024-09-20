package PracticaPatronesEstructurales.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private final List<Libro> libros = new ArrayList<Libro>();

    public void tiendaDeLibros(String titulo, double precio, String tipo, String distribuidor, String otroDato) {
        TipoDeLibro tipoDeLibro = LibroFactory.getTipoDelibro(tipo,distribuidor,otroDato);
        libros.add(new Libro(titulo,precio,tipoDeLibro));
    }

    public void mostrarLibros(){
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }
    }
}
