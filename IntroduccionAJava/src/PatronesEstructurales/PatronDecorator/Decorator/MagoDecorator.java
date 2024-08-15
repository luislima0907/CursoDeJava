package PatronesEstructurales.PatronDecorator.Decorator;

import PatronesEstructurales.PatronDecorator.Enemigo;

public class MagoDecorator extends EnemigoDecorator{
    public MagoDecorator(Enemigo enemigo) {
        super(enemigo);
    }
    @Override
    public void atacar() {
        super.atacar();
        System.out.println("El mago esta atacando");
    }
}
