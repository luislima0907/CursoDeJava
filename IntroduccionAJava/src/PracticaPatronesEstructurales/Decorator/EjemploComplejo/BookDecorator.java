package PracticaPatronesEstructurales.Decorator.EjemploComplejo;

public abstract class BookDecorator implements Book {
    protected Book book;

    public BookDecorator(Book book) {
        this.book = book;
    }

    @Override
    public void mostrar() {
        book.mostrar();
    }
}
