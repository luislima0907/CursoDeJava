package PatronesDeComportamiento.Iterator;

public class Item {
    private String nombre;
    private int precio;
    private Item siguiente;

    public Item(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Item getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Item siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + '\'' +
                "precio = " + precio;
    }
}
