package PatronesEstructurales.PatronDecorator.Decorator;

import PatronesEstructurales.PatronDecorator.Enemigo;

public class AsesinoDecorator extends EnemigoDecorator{

    public AsesinoDecorator(Enemigo enemigo) {
        super(enemigo);
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("El asesino ataca");
    }
}
