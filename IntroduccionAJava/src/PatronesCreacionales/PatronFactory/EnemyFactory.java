package PatronesCreacionales.PatronFactory;

public class EnemyFactory {

    public Enemigo crearEnemigo(String tipo) {
        if (tipo.equalsIgnoreCase("Guerrero")) {
            return new Guerrero();
        } else if (tipo.equalsIgnoreCase("Mago")) {
            return new Mago();
        }
        else {
            return null;
        }
    }
}
