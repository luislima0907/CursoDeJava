package PracticaDePatronesDeComportamiento.Iterator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class IteratorProfundo<T> implements Iterator<T> {
    private final Vertice<T> verticeInicial;
    private final Deque<Vertice<T>> pila = new LinkedList<>();

    public IteratorProfundo(Vertice<T> verticeInicial) {
        this.verticeInicial = verticeInicial;
        pila.push(verticeInicial);
    }

    @Override
    public boolean hasNext() {
        return !pila.isEmpty();
    }

    @Override
    public Vertice<T> getNext() {
        if (!hasNext()) {
            return null;
        }
        Vertice<T> verticeActual = pila.pop();
        if (!verticeActual.isVisitado()){
            verticeActual.setVisitado(true);
            verticeActual.getVertices().forEach(pila::push);
            return verticeActual;
        }
        return getNext();
    }

    @Override
    public void reset() {
        pila.clear();
        pila.push(verticeInicial);
    }
}
