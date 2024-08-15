package PatronesEstructurales.Flyweight.Activos;

public class Textura {
    private String textura;

    public Textura(String textura) {
        this.textura = textura;
    }

    @Override
    public String toString() {
        return textura;
    }
}
