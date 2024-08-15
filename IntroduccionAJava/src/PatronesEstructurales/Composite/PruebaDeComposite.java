package PatronesEstructurales.Composite;

public class PruebaDeComposite {
    public static void main(String[] args) {
        ItemBase inventario = new Bolsa("Inventario");
        ItemBase bolsaDeMonedas = new Bolsa("Bolsa de monedas");
        ItemBase bolsaDePosiones = new Bolsa("Bolsa de posiones");

        ItemBase monedas = new Item("Moneda", 4);
        bolsaDeMonedas.addItem(monedas);
        ItemBase posiones = new Item("Posiones", 5);
        bolsaDePosiones.addItem(posiones);

        ItemBase espada = new Item("Espada", 6);
        ItemBase escudo = new Item("Escudo", 7);

        inventario.addItem(bolsaDeMonedas);
        inventario.addItem(bolsaDePosiones);
        inventario.addItem(escudo);
        inventario.addItem(espada);

        System.out.println("Valor del inventario: " + inventario.getValor());
    }
}
