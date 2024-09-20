package PracticaDePatronesDeComportamiento.Iterator;

import lombok.Data;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;

@Data
public class Vertice<T> {
    private final T elemento;
    private boolean visitado;

    @ToString.Exclude
    private List<Vertice<T>> vertices = new LinkedList<>();
}
