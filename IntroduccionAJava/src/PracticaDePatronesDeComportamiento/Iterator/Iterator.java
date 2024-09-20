package PracticaDePatronesDeComportamiento.Iterator;

public interface Iterator<T> {
    public boolean hasNext();
    public Vertice<T> getNext();
    public void reset();
}
