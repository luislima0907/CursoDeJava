package PracticaPatronesEstructurales.Decorator.EjemploComplejo;

public class HighlightedBook extends BookDecorator{

    public HighlightedBook(Book book) {
        super(book);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("texto resaltado");
    }
}
