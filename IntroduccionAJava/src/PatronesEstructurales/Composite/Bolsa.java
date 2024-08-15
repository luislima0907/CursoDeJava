package PatronesEstructurales.Composite;

import java.util.ArrayList;

public class Bolsa extends ItemBase{

    public Bolsa(String nombre) {
        super(nombre, 0);
        items = new ArrayList<>();
    }

    @Override
    public void addItem(ItemBase item) {
        items.add(item);
    }

    @Override
    public void removeItem(ItemBase item) {
        items.remove(item);
    }

    @Override
    public int getValor() {
        int resultado = valor;
        for (ItemBase item : items) {
            resultado += item.getValor();
        }
        return resultado;
    }
}
