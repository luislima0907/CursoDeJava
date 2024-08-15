package PatronesCreacionales.PatronPrototype;

public abstract class Enemigo {
    protected int salud;
    protected int danio;

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public Enemigo(int salud, int danio) {
        this.salud = salud;
        this.danio = danio;
    }

    public Enemigo(Enemigo enemigo) {
        if (enemigo != null) {
            setSalud(enemigo.getSalud());
            setDanio(enemigo.getDanio());
        }
    }
    public abstract Enemigo Clonar();
}
