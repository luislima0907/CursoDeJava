package PatronesDeComportamiento.Observer;

public abstract class Enemigo {
    private String nombre;
    private boolean estado;

    public Enemigo(String nombre) {
        this.nombre = nombre;
    }

    public abstract void atacar();
    public abstract void activar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
