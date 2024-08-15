package PatronesDeComportamiento.Strategy;

public class Jugador {
    private String nombre;
    private int salud;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.salud = 100;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
