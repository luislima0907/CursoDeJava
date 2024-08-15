package PatronesDeComportamiento.ChainOfResponsibility;

public abstract class AtaqueElemental {

    protected AtaqueElemental siguiente;

    public AtaqueElemental(AtaqueElemental siguiente) {
        this.siguiente = siguiente;
    }

    public AtaqueElemental() {

    }

    public AtaqueElemental getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(AtaqueElemental siguiente) {
        this.siguiente = siguiente;
    }

    public boolean elSiguienteTiene(){
        return getSiguiente()!=null;
    }

    public abstract void atacar(Jugador jugador);
}
