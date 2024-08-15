package PatronesEstructurales.Bridge.Enemigo;

import PatronesEstructurales.Bridge.Luchador.Luchador;

public abstract class Enemigo {
    protected int salud;
    protected Luchador luchador;

    public Luchador getLuchador() {
        return luchador;
    }

    public void setLuchador(Luchador luchador) {
        this.luchador = luchador;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
}
