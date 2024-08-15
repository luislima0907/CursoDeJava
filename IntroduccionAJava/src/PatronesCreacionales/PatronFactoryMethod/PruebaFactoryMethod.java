package PatronesCreacionales.PatronFactoryMethod;

public class PruebaFactoryMethod {
    public static void main(String[] args) {
        // SEGUNDA FORMA DE USAR FACTORY: FACTORY METHOD
        /* Aqui lo que hacemos es dividir la creacion de objetos por medio
        * de una clase abstracta que implementa la interfaz principal, luego
        * creamos una clase por cada objeto que queramos crear por medio de este patron*/

        Enemigo guerreroMethod = new GuerreroFactory().crearEnemigo();
        Enemigo magoMethod = new MagoFactory().crearEnemigo();
        guerreroMethod.atacar();
        magoMethod.atacar();
    }
}
