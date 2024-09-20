package PracticaPatronesEstructurales.Decorator.EjemploSimple;

public class PruebaDecorator {
    public static void main(String[] args) {
        Bebida bebida = new Caramelo(new CafeExpreso());
        Bebida bebidaModificada = new Soya(bebida);
        System.out.println(bebidaModificada.costo());
    }
}
