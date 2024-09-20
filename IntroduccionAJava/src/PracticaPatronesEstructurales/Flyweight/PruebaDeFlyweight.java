package PracticaPatronesEstructurales.Flyweight;

import java.util.List;
import java.util.Random;

public class PruebaDeFlyweight {
    private static final int TIPO_DE_LIBROS = 2;
    private static final int CANTIDAD_DE_LIBROS = 10_000_000;
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        for (int i = 0; i < CANTIDAD_DE_LIBROS / TIPO_DE_LIBROS; i++) {
            tienda.tiendaDeLibros(getTituloRandomLibro(), getPrecioRandomLibro(),"Action", "Follett", "Stuff");
            tienda.tiendaDeLibros(getTituloRandomLibro(), getPrecioRandomLibro(),"Fantasia", "Ingram", "Extra");
        }
        //tienda.mostrarLibros();
        System.out.println(CANTIDAD_DE_LIBROS + " Libros ingresados");
        System.out.println("-------------------------------------------");
        System.out.println("Memoria usada: ");
        System.out.println("Peso del libro (20 bytes) * " + CANTIDAD_DE_LIBROS + " tipo de libros (30 bytes) * " + TIPO_DE_LIBROS + "");
        System.out.println("-------------------------------------------");
        System.out.println("Total: " + ((CANTIDAD_DE_LIBROS * 20 + TIPO_DE_LIBROS * 30) / 1024 / 1024) + "MB (instead of " + ((CANTIDAD_DE_LIBROS * 50) / 1024 / 1024) + "MB)");
    }

    private static String getTituloRandomLibro() {
        List<String> libros = List.of("book_1", "book_2", "book_3", "book_4", "book_5", "book_6", "book_7", "book_8", "book_9", "book_10");
        return libros.get(new Random().nextInt(libros.size()));
    }

    private static double getPrecioRandomLibro() {
        return new Random().nextDouble(10, 200);
    }
}
