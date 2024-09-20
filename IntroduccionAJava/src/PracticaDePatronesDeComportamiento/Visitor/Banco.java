package PracticaDePatronesDeComportamiento.Visitor;

public class Banco extends Cliente {
    private final int sucursalesAseguradas;

    public Banco(String nombre, String direccion, String telefono, int sucursalesAseguradas) {
        super(nombre, direccion, telefono);
        this.sucursalesAseguradas = sucursalesAseguradas;
    }

    @Override
    public void aceptar(Visitor visitor) {
        System.out.println("Visitando al banco");
        visitor.visitar(this);
    }
}
