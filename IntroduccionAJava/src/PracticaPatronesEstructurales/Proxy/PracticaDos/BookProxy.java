package PracticaPatronesEstructurales.Proxy.PracticaDos;

import java.util.ArrayList;
import java.util.List;

public class BookProxy implements Book{
    private RealBook realBook = null;
    private static final List<String> libros;
    private String title;
    private boolean isAuthorized;

    static {
        libros = new ArrayList<>();
        libros.add("Cien Años de Soledad");
        libros.add("Calculo James Stewart");
        libros.add("Games Of Thrones");
    }

    public BookProxy(String title, boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
        this.title = title;
    }

    @Override
    public void display() {
        if (isAuthorized) {
            if (libros.contains(title)) {
                if (realBook == null) {
                    this.realBook = new RealBook(title);
                }
            } else {
                throw new RuntimeException("No existe el libro en nuestra biblioteca");
            }
            this.realBook.display();
        } else {
            if (libros.contains(title)) {
                System.out.println("Acceso denegado a: " + title);
            } else {
                throw new RuntimeException("No existe el libro en nuestra biblioteca");
            }
        }
    }
}
