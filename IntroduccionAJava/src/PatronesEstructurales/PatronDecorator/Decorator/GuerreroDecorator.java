package PatronesEstructurales.PatronDecorator.Decorator;

import PatronesEstructurales.PatronDecorator.Enemigo;

public class GuerreroDecorator extends EnemigoDecorator{
    public GuerreroDecorator(Enemigo enemigo) {
        super(enemigo);
    }
    @Override
    public void atacar() {
        super.atacar();
        System.out.println("El guerrero esta atacando");
    }
}
