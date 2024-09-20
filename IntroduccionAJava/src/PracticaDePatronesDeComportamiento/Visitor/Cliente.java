package PracticaDePatronesDeComportamiento.Visitor;

public abstract class Cliente {
    private final String nombre;
    private final String direccion;
    private final String telefono;

    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public abstract void aceptar(Visitor visitor);

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
}
