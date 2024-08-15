package PatronesCreacionales.PatronFactory;

public class PruebaFactory {
    public static void main(String[] args) {
        // primera forma de usar el patron Factory
        /*Para esto debemos de crear una interfaz que tomaremos como plantilla
         * a la hora de crear objetos, esa interfaz se la implementamos a cada una
         * de las clases que necesitemos, en este ejemplo tenemos una interfaz enemigo
         * la cual vamos a implementar en dos clases: mago y guerrero.
         *
         * luego debemos de crear una clase para usar el factory convencional
         * que consiste en crear un metodo del mismo tipo de la interfaz, en este caso
         * enemigo y por medio de los parametros que le ingresemos a ese metodo, nos
         * pueda crear un objeto de una clase u otra.*/
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemigo guerrero = enemyFactory.crearEnemigo("Guerrero");
        Enemigo mago = enemyFactory.crearEnemigo("Mago");
        guerrero.atacar();
        mago.atacar();
    }
}
