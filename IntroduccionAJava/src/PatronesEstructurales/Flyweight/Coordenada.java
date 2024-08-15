package PatronesEstructurales.Flyweight;

public class Coordenada {
    private int posicionX;
    private int posicionY;
    private int posicionZ;

    public Coordenada(){
        this.posicionX = (int)(Math.random()*1000);
        this.posicionY = (int)(Math.random()*1000);
        this.posicionZ = (int)(Math.random()*1000);
    }

    public static Coordenada getCoordenadas(){
        return new Coordenada();
    }

    @Override
    public String toString() {
        return "posicionX=" + posicionX +
                "posicionY=" + posicionY +
                "posicionZ=" + posicionZ;
    }
}
