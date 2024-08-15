package PatronesEstructurales.Facade;

public class BancoDeTrabajo implements Herreria{
    public static final String ACCION = "mejorar";

    @Override
    public void trabajar(String nombre) {
        System.out.println("Vamos a " + ACCION + " el/la " + nombre + "....");
    }

    @Override
    public boolean buscar(String nombre) {
        return Inventario.buscar(nombre, false);
    }

    @Override
    public void remover(String nombre) {
        Inventario.remover(nombre, false);
    }

    @Override
    public void trabajando(String nombre) {
        System.out.println("Mejorando: " + nombre);
    }
}
