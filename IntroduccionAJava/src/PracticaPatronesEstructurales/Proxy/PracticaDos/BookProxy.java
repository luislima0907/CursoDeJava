package PracticaPatronesEstructurales.Proxy.PracticaDos;

import java.util.ArrayList;
import java.util.List;

// el cliente interactua con el proxy y el proxy interactua con el objeto real
// esto gracias a que el proxy tiene un atributo con el objeto real para poder
// controlar su acceso
public class BookProxy implements Book{ // el proxy siempre implementa la misma interfaz del objeto que
    // va a representar
    // en resumen, el proxy es el encargado de controlar las instancias del objeto que esta representando
    private RealBook realBook; // este atributo que contiene el objeto real es null, porque como
    // lo dijimos anteriormente, al momento de instanciar el objeto real, nos costara mucho tiempo o recursos
    // entonces por eso le delegamos al metodo implementado de la interfaz (display) ese trabajo de referenciar
    // o instanciar el objeto real y a su vez lo muestre
    private static final List<String> libros;
    private String title;
    private boolean isAuthorized;

    static {
        libros = new ArrayList<>();
        libros.add("Cien Años de Soledad");
        libros.add("Calculo James Stewart");
        libros.add("Games Of Thrones");
    }

    // el cliente instancia el proxy, pero el proxy no instancia al objeto real
    // hasta que se lo indiquemos con el metodo display, esto pasa porque
    // el proxy no sabe si realmente quieres que te muestre el libro, y por ende, cargarlo antes de que te lo muestre
    // porque es una tarea muy costosa, asi que el proxy esperara hasta que le indiques que realmente si
    // quieres visualizar el libro para poder cargarlo y mostrartelo
    public BookProxy(String title, boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
        this.title = title;
    }

    // aqui estamos aplazando el metodo para cargar el libro desde el disco, porque
    // es una tarea costosa para el programa, por lo tanto, solo lo haremos cuando sea necesario
    // es decir, cuando queramos mostrarle el libro al cliente por medio del metodo display
    @Override
    public void display() { // este metodo es el que delega la instancia hacia el objeto real
        if (isAuthorized) {
            if (libros.contains(title)) {
                if (realBook == null) {
                    // guarda una referencia con la carga del libro que ingresaste,
                    // y se carga y muestra, solamente si lo pides
                    realBook = new RealBook(title);
                }
            } else {
                throw new RuntimeException("No existe el libro en nuestra biblioteca");
            }
            realBook.display();
        } else {
            if (libros.contains(title)) {
                System.out.println("Acceso denegado a: " + title);
            } else {
                throw new RuntimeException("No existe el libro en nuestra biblioteca");
            }
        }
    }
}
