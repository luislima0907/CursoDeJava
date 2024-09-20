package PracticaPatronesEstructurales.Decorator.EjemploSimple;

public class Caramelo extends BebidaDecorator{
    public Caramelo(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public int costo() {
        return bebida.costo() + 2;
    }
}
