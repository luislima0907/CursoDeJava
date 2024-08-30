package PracticaPatronesEstructurales.Proxy.PracticaDos;

public class PruebaProxyDos {
    public static void main(String[] args) {

        // aplicamos el patron proxy porque optimizamos el rendimiento
        Book libroNuevo = new RealBook("Patrones estructurales"); // llamada costosa de algun metodo
        //libroNuevo.display(); // llamada varata de algun metodo

        // Proxy Pattern
        // Protection Proxy
        // Sirve para controlar el acceso a un objeto, segun los permisos que tenga
        // el usuario en el programa
        Book proxyBook = new BookProxy("Cien Años de Soledad", true);
        //(Virtual Proxy)
        // solo crea una referencia del objeto cuando es necesario ya que puede que sea
        // una tarea muy costosa
        //proxyBook.display();
    }
}
