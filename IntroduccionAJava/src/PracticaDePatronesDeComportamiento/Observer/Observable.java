package PracticaDePatronesDeComportamiento.Observer;

import java.util.Observer;

public interface Observable {
    // definimos esta interfaz juntos con los metodos de agregar y remover
    // que nos serviran para manejar a los observadores que estaran
    // suscritos a los cambios que tenga el objeto obervable
    public void agregar(Observador observador);
    public void remover(Observador observador);
    public void notificarObservadores();
}
