package PatronesCreacionales.PatronFactoryMethod;

public class GuerreroFactory extends EnemyFactory{
    @Override
    public Enemigo crearEnemigo() {
        return new Guerrero();
    }
}
