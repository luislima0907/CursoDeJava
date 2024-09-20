package PracticaDePatronesCreacionales.Prototype;

public class Carro extends Vehiculo{
    private int velocidad;

    public Carro(String marca, String modelo, String color, int velocidad) {
        super(marca, modelo, color);
        this.velocidad = velocidad;
    }

    private Carro(Carro carro) {
        super(carro);
        this.velocidad = carro.velocidad;
    }

    @Override
    public Carro clonarVehiculo() {
        return new Carro(this);
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
