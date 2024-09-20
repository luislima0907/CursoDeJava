package PracticaPatronesEstructurales.Decorator.EjemploSimple;

public class Soya extends BebidaDecorator{
    public Soya(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public int costo() {
        return bebida.costo() + 4;
    }
}
