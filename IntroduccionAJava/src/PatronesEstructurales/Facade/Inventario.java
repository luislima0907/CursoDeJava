package PatronesEstructurales.Facade;

public interface Inventario {
    public static boolean buscar(String nombre, boolean crear) {
        String accion = crear ? "crear" : "mejorar";
        if(Math.random() > 0.5) {
            System.out.println("Tienes los materiales necesarios para: " + accion + " el/la " + nombre);
            return true;
        } else {
            System.out.println("No tienes materiales para: " + accion + " el/la " + nombre);
            return false;
        }
    }

    public static void remover(String nombre, boolean crear){
        String accion = crear ? "crear" : "mejorar";
        System.out.println("Eliminando de tu inventario los materiales utilizados para: " + accion + " el/la " + nombre);
    }
}
