package PracticaDePatronesDeComportamiento.Visitor;

public class Residente extends Cliente{
    private final int segurosDeClase;

    public Residente(String nombre, String direccion, String telefono, int segurosDeClase) {
        super(nombre, direccion, telefono);
        this.segurosDeClase = segurosDeClase;
    }

    @Override
    public void aceptar(Visitor visitor) {
        System.out.println("Visitando al residente");
        visitor.visitar(this);
    }
}
