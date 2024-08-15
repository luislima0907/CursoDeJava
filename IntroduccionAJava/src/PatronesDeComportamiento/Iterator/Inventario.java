package PatronesDeComportamiento.Iterator;

public class Inventario {
    private Item cabeza, rama;
    private int tamanio, posicion;

    public Inventario(Item item) {
        this.cabeza = item;
        this.rama = item;
        posicion = 0;
        tamanio = 1;
    }

    public Inventario(){
        tamanio = posicion = 0;
    }

    public boolean estaVacio() {
        return tamanio == 0;
    }

    public void agregarVacio(Item item) {
        this.cabeza = item;
        this.rama = item;
        tamanio = 1;
    }

    public void agregarInicio(Item item){
        if (estaVacio()){
            agregarVacio(item);
            return;
        }
        item.setSiguiente(cabeza);
        cabeza = item;
        tamanio++;
    }

    public void agregarFinal(Item item){
        if (estaVacio()){
            agregarVacio(item);
            return;
        }
        rama.setSiguiente(item);
        rama = item;
        tamanio++;
    }

    private Item get(int posicion) {
        if (posicion > tamanio || posicion < 0 || estaVacio()){
            return null;
        }
        int contador = 0;
        Item item = cabeza;
        while (contador < posicion){
            item = item.getSiguiente();
            contador++;
        }
        return item;
    }

    public ItemIterator iterator(){
        return new ItemIterator() {
            @Override
            public boolean tieneSiguiente() {
                if (posicion == tamanio){
                    reiniciar();
                    return false;
                }
                return true;
            }

            @Override
            public Item siguienteItem() {
                if (!tieneSiguiente()){
                    return null;
                }
                Item item = get(posicion);
                posicion++;
                return item;
            }

            @Override
            public void reiniciar() {
                posicion = 0;
            }
        };
    }
}
