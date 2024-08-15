package PatronesCreacionales.PatronAbstractFactory;

import PatronesCreacionales.PatronAbstractFactory.Arma.Arma;
import PatronesCreacionales.PatronAbstractFactory.Armadura.Armadura;
import PatronesCreacionales.PatronAbstractFactory.Enemigo.Enemigo;
import PatronesCreacionales.PatronAbstractFactory.Factory.EnemigoAbstractFactory;
import PatronesCreacionales.PatronAbstractFactory.Factory.GuerreroFactory;
import PatronesCreacionales.PatronAbstractFactory.Factory.MagoFactory;

public class PruebaAbstractFactory {
    public static void main(String[] args) {
        /* TERCERA FORMA PARA USAR EL PATRON FACTORY: FACTORY ABSTRACT
        *
        * Esta es una forma de crear varias fabricas divididas por familias
        * de clase, por ejemplo los enemigos pueden ser guerreros o magos, entonces
        * creamos una fabrica para hacer a los enemigos, a su vez, esos enemigos
        * tienen armas y armaduras, entonces creamos una fabrica para las armas
        * y otra fabrica para las armaduras*/
        EnemigoAbstractFactory enemigoAbstractFactory = new GuerreroFactory();
        Enemigo guerrero = enemigoAbstractFactory.crearEnemigo();
        Armadura armaduraPesada = enemigoAbstractFactory.crearArmadura();
        Arma hacha = enemigoAbstractFactory.crearArma();

        guerrero.atacar();
        armaduraPesada.proteger();
        hacha.danio();

        enemigoAbstractFactory = new MagoFactory();


        Enemigo mago = enemigoAbstractFactory.crearEnemigo();
        Armadura tunica = enemigoAbstractFactory.crearArmadura();
        Arma baston = enemigoAbstractFactory.crearArma();
        mago.atacar();
        tunica.proteger();
        baston.danio();
    }
}
