package PracticaDePatronesDeComportamiento.Strategy;

public class SimpleQuack implements Quack{
    @Override
    public void quack() {
        System.out.println("Quack simple");
    }
}
