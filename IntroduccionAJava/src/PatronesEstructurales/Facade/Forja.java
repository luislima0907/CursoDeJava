package PatronesEstructurales.Facade;

public class Forja implements Herreria{

    public static final String ACCION = "crear";

    @Override
    public void trabajar(String nombre) {
        System.out.println("Vamos a " + ACCION + " el/la " + nombre + "...");
    }

    @Override
    public boolean buscar(String nombre) {
        return Inventario.buscar(nombre, true);
    }

    @Override
    public void remover(String nombre) {
        Inventario.remover(nombre, true);
    }

    @Override
    public void trabajando(String nombre) {
        System.out.println("Creando: " + nombre);
    }
}
