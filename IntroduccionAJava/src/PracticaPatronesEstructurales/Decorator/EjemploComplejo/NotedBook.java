package PracticaPatronesEstructurales.Decorator.EjemploComplejo;

public class NotedBook extends BookDecorator{
    public NotedBook(Book book) {
        super(book);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Notas agregadas al libro");
    }
}
