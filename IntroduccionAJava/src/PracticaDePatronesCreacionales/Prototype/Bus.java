package PracticaDePatronesCreacionales.Prototype;

public class Bus extends Vehiculo{
    private int puertas;

    public Bus(String marca, String modelo, String color, int puertas) {
        super(marca, modelo, color);
        this.puertas = puertas;
    }

    protected Bus(Bus bus) {
        super(bus);
        this.puertas = bus.puertas;
    }

    @Override
    public Bus clonarVehiculo() {
        return new Bus(this);
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", puertas=" + puertas +
                '}';
    }
}
