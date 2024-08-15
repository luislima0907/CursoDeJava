package PatronesDeComportamiento.Memento;

public class Memento {
    private int nivel;
    private int muertes;

    public Memento(Juego juego){
        nivel = juego.getNivel();
        muertes = juego.getMuertes();
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getMuertes() {
        return muertes;
    }

    public void setMuertes(int muertes) {
        this.muertes = muertes;
    }
}
