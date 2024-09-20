package PracticaPatronesEstructurales.Decorator.EjemploComplejo;

public class PruebaDecorator {
    public static void main(String[] args) {
        Book librolenguaje = new BookLanguaje();
        Book librolenguajeModificado = new BorderBook(new NotedBook(new HighlightedBook(librolenguaje)));
        librolenguajeModificado.mostrar();
    }
}
