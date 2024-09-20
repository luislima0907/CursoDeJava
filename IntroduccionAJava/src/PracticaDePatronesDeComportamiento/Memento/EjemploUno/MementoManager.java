package PracticaDePatronesDeComportamiento.Memento.EjemploUno;

import java.util.ArrayList;
import java.util.List;

public class MementoManager {

    private List<Memento> mementos = new ArrayList<>();
    private int indice;

    public MementoManager() {
        indice = 0;
    }

    public void guardar(Memento memento) {
        mementos.add(memento);
    }

    public Memento deshacerMemento() {
        if(mementos.isEmpty() || indice == mementos.size()) {
            throw new IndexOutOfBoundsException("No se ha encontrado memento");
        }
        Memento memento = mementos.get(indice);
        indice++;
        return memento;
    }

    public Memento rehacerMemento() {
        if(mementos.isEmpty() || indice == 0) {
            throw new IndexOutOfBoundsException("No se ha encontrado memento");
        }
        Memento memento = mementos.get(indice);
        indice--;
        return memento;
    }

}
