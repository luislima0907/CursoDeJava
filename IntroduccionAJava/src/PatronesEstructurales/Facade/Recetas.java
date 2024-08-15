package PatronesEstructurales.Facade;

public interface Recetas {
    public static boolean getReceta(String nombre, boolean crear) {
        String accion = crear ? "crear" : "mejorar";
        if(Math.random() > 0.5) {
            System.out.println("Tienes habilidades necesarias para: " + accion + " el/la " + nombre);
            return true;
        } else {
            System.out.println("No tienes habilidades para: " + accion + " el/la " + nombre);
            return false;
        }
    }
}
