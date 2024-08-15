package PatronesDeComportamiento.Iterator;

import java.util.Iterator;

public class NodoLista<T> implements Iterable<Nodo<T>>{
    private Nodo<T> cabeza, rama;
    private int tamanio, posicion;

    public NodoLista() {
        tamanio = posicion = 0;
    }

    public NodoLista(Nodo<T> nodo) {
        this.cabeza = nodo;
        this.rama = nodo;
        posicion = 0;
        tamanio = 1;
    }

    public boolean estaVacio() {
        return tamanio == 0;
    }

    public void agregarVacio(T valor) {
        Nodo<T> nodo = new Nodo<>(valor);
        this.cabeza = nodo;
        this.rama = nodo;
        tamanio = 1;
    }

    public void agregarInicio(T valor){
        if (estaVacio()){
            agregarVacio(valor);
            return;
        }
        Nodo<T> nodo = new Nodo<>(valor);
        nodo.setSiguiente(cabeza);
        cabeza = nodo;
        tamanio++;
    }

    public void agregarFinal(T valor){
        if (estaVacio()){
            agregarVacio(valor);
            return;
        }
        Nodo<T> nodo = new Nodo<>(valor);
        rama.setSiguiente(nodo);
        rama = nodo;
        tamanio++;
    }

    private Nodo<T> get(int posicion) {
        if (posicion > tamanio || posicion < 0 || estaVacio()){
            return null;
        }
        int contador = 0;
        Nodo<T> nodo = cabeza;
        while (contador < posicion){
            nodo = nodo.getSiguiente();
            contador++;
        }
        return nodo;
    }

    @Override
    public Iterator<Nodo<T>> iterator() {
        Iterator<Nodo<T>> iterator = new Iterator<Nodo<T>>() {
            @Override
            public boolean hasNext() {
                if(posicion < tamanio){
                    return true;
                }
                return false;
            }

            @Override
            public Nodo<T> next() {
                Nodo<T> siguiente = get(posicion);
                posicion++;
                return siguiente;
            }
        };
        return iterator;
    }
}
