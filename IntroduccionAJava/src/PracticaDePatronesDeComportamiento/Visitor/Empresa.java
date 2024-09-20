package PracticaDePatronesDeComportamiento.Visitor;

public class Empresa extends Cliente{
    private final int numeroDeEmpleados;

    public Empresa(String nombre, String direccion, String telefono, int numeroDeEmpleados) {
        super(nombre, direccion, telefono);
        this.numeroDeEmpleados = numeroDeEmpleados;
    }

    @Override
    public void aceptar(Visitor visitor) {
        System.out.println("Visitando a la Empresa");
        visitor.visitar(this);
    }
}
