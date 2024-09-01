package PracticaPatronesEstructurales.Proxy.PracticaDos;

public class PruebaProxyDos {
    public static void main(String[] args) {

        //Book libroNuevo = new RealBook("Patrones estructurales"); // llamada costosa de algun metodo
        //libroNuevo.display(); // llamada varata de algun metodo


        Book proxyBook = new BookProxy("Cien Años de Soledad", true);
        //(Virtual Proxy)
        proxyBook.display();
    }
}
