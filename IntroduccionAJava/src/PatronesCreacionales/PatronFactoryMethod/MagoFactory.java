package PatronesCreacionales.PatronFactoryMethod;

public class MagoFactory extends EnemyFactory{

    @Override
    public Enemigo crearEnemigo() {
        return new Mago();
    }
}
