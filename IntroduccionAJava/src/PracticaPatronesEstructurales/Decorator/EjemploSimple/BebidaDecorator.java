package PracticaPatronesEstructurales.Decorator.EjemploSimple;

public abstract class BebidaDecorator extends Bebida {
    protected Bebida bebida;
    public abstract int costo();
}
