package PatronesEstructurales.Composite;

import java.util.List;

public abstract class ItemBase {
    protected String nombre;
    protected int valor;
    protected List<ItemBase> items;

    public ItemBase(String nombre, int valor){
        this.nombre = nombre;
        this.valor = valor;
    }
    public abstract void addItem(ItemBase item);
    public abstract void removeItem(ItemBase item);
    public abstract int getValor();
}
