package PatronesDeComportamiento.State;

public class Mision {
    private String nombre;
    private EstadoDeLaMision estadoDeLaMision;

    public Mision(String nombre) {
        this.nombre = nombre;
        estadoDeLaMision = new Bloqueada();
    }
    public void siguiente(){
        estadoDeLaMision.siguiente(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstadoDeLaMision getEstadoDeLaMision() {
        return estadoDeLaMision;
    }

    public void setEstadoDeLaMision(EstadoDeLaMision estadoDeLaMision) {
        this.estadoDeLaMision = estadoDeLaMision;
    }

    @Override
    public String toString() {
        return getNombre() + estadoDeLaMision.imprimir();
    }
}
