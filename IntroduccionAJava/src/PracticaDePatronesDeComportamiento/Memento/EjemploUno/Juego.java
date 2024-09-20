package PracticaDePatronesDeComportamiento.Memento.EjemploUno;

public class Juego {
    private String nombre;
    private int nivel;
    private int muertes;
    private static MementoManager mementoManager = new MementoManager();

    public Juego(){

    }

    public Juego(String nombre){
        this.nombre = nombre;
    }

    public Juego(String nombre, int nivel, int muertes){
        this.nombre = nombre;
        this.nivel = nivel;
        this.muertes = muertes;
    }

    public void guardar(){
        mementoManager.guardar(new Memento(this));
    }

    public void deshacer(){
        Memento memento = mementoManager.deshacerMemento();
        setNivel(memento.getNivel());
        setMuertes(memento.getMuertes());
    }

    public void rehacer(){
        Memento memento = mementoManager.rehacerMemento();
        setNivel(memento.getNivel());
        setMuertes(memento.getMuertes());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "nombre = " + nombre +
                ", nivel=" + nivel +
                ", muertes=" + muertes;
    }
}
