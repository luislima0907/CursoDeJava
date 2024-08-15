package PatronesEstructurales.Composite;

public class Item extends ItemBase{


    public Item(String nombre, int valor) {
        super(nombre, valor);
    }

    @Override
    public void addItem(ItemBase item) {
        System.out.println("El item no se puede agregar");
    }

    @Override
    public void removeItem(ItemBase item) {

    }

    @Override
    public int getValor() {
        return valor;
    }
}
