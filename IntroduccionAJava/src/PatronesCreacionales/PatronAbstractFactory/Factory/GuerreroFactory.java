package PatronesCreacionales.PatronAbstractFactory.Factory;

import PatronesCreacionales.PatronAbstractFactory.Arma.Arma;
import PatronesCreacionales.PatronAbstractFactory.Arma.Hacha;
import PatronesCreacionales.PatronAbstractFactory.Armadura.Armadura;
import PatronesCreacionales.PatronAbstractFactory.Armadura.ArmaduraPesada;
import PatronesCreacionales.PatronAbstractFactory.Enemigo.Enemigo;
import PatronesCreacionales.PatronAbstractFactory.Enemigo.Guerrero;

public class GuerreroFactory extends EnemigoAbstractFactory{
    @Override
    public Enemigo crearEnemigo() {
        return new Guerrero();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraPesada();
    }

    @Override
    public Arma crearArma() {
        return new Hacha();
    }
}
