package PatronesEstructurales.Flyweight.Activos;

public class Sonido {
    private String sonido;

    public Sonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String toString() {
        return sonido;
    }
}
