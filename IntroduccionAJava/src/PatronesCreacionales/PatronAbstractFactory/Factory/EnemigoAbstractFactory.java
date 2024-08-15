package PatronesCreacionales.PatronAbstractFactory.Factory;

import PatronesCreacionales.PatronAbstractFactory.Arma.Arma;
import PatronesCreacionales.PatronAbstractFactory.Armadura.Armadura;
import PatronesCreacionales.PatronAbstractFactory.Enemigo.Enemigo;

public abstract class EnemigoAbstractFactory {
    public abstract Enemigo crearEnemigo();
    public abstract Armadura crearArmadura();
    public abstract Arma crearArma();
}
