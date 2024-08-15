package PatronesDeComportamiento.Iterator;

public class PruebaDeIteratorDos {
    public static void main(String[] args) {

        Inventario inventario = new Inventario();
        inventario.agregarFinal(new Item("Espada", 10));
        inventario.agregarFinal(new Item("Escudo", 20));
        inventario.agregarFinal(new Item("Armadura", 30));
        inventario.agregarFinal(new Item("Posicones", 40));
        ItemIterator iterator = inventario.iterator();

        while (iterator.tieneSiguiente()){
            System.out.println(iterator.siguienteItem());
        }
        System.out.println("------------------------");
        while (iterator.tieneSiguiente()){
            System.out.println(iterator.siguienteItem());
        }

        //        NodoLista<String> listaNodo = new NodoLista<>(new Nodo<>("Hola"));
//        listaNodo.agregarFinal("que");
//        listaNodo.agregarFinal("tal");
//        Iterator<Nodo<String>> iterator = listaNodo.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        listaNodo.forEach(System.out::println);
    }
}
