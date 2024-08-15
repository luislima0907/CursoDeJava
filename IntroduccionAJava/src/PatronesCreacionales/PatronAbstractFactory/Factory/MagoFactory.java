package PatronesCreacionales.PatronAbstractFactory.Factory;

import PatronesCreacionales.PatronAbstractFactory.Arma.Arma;
import PatronesCreacionales.PatronAbstractFactory.Arma.baston;
import PatronesCreacionales.PatronAbstractFactory.Armadura.Armadura;
import PatronesCreacionales.PatronAbstractFactory.Armadura.Tunica;
import PatronesCreacionales.PatronAbstractFactory.Enemigo.Enemigo;
import PatronesCreacionales.PatronAbstractFactory.Enemigo.Mago;

public class MagoFactory extends EnemigoAbstractFactory{
    @Override
    public Enemigo crearEnemigo() {
        return new Mago();
    }

    @Override
    public Armadura crearArmadura() {
        return new Tunica();
    }

    @Override
    public Arma crearArma() {
        return new baston();
    }
}
