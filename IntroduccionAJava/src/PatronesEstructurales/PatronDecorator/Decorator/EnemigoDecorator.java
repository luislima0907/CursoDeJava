package PatronesEstructurales.PatronDecorator.Decorator;

import PatronesEstructurales.PatronDecorator.Enemigo;

public abstract class EnemigoDecorator implements Enemigo {
    protected Enemigo enemigo;

    public EnemigoDecorator(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    @Override
    public void atacar() {
        enemigo.atacar();
    }
}
