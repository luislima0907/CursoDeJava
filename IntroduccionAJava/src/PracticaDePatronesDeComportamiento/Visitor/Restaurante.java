package PracticaDePatronesDeComportamiento.Visitor;

public class Restaurante extends Cliente{
    private final int sucursalesDisponibles;

    public Restaurante(String nombre, String direccion, String telefono, int sucursalesDisponibles) {
        super(nombre, direccion, telefono);
        this.sucursalesDisponibles = sucursalesDisponibles;
    }

    @Override
    public void aceptar(Visitor visitor) {
        System.out.println("Visitando al restaurante");
        visitor.visitar(this);
    }
}
