package PracticaPatronesEstructurales.Decorator.EjemploComplejo;

public class BorderBook extends BookDecorator{
    public BorderBook(Book book) {
        super(book);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Libro con borde");
    }
}
