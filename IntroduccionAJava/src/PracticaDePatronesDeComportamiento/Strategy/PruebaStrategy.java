package PracticaDePatronesDeComportamiento.Strategy;

public class PruebaStrategy {
    public static void main(String[] args) {
        //SimpleQuack simpleQuack = new SimpleQuack();
        Pato primerPato = new Pato(new SimpleQuack(), new VolarRapido(), new MostrarGraficamente());
        primerPato.quack();
        primerPato.volar();
        primerPato.mostrar();
    }
}
