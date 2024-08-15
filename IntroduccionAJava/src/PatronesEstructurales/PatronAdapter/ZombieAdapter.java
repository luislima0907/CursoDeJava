package PatronesEstructurales.PatronAdapter;

public class ZombieAdapter implements Enemigo{

    private Zombie zombie;

    public ZombieAdapter() {
        this.zombie = new Zombie();
    }

    @Override
    public void atacar() {
        int valor = (int)Math.random()*10;
        if (valor % 2 == 0) {
            zombie.Morder();
        }
        else {
            zombie.Golpear();
        }
    }

    @Override
    public void danio() {
        int valor = (int)Math.random()*10;
        if (valor % 2 == 0) {
            zombie.GolpeEnLaCabeza();
        }
        else {
            zombie.DanioDeCuerpo();
        }
    }
}
