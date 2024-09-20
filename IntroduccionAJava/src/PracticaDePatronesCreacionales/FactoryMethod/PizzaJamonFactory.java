package PracticaDePatronesCreacionales.FactoryMethod;

public class PizzaJamonFactory extends PizzaFactory {
    @Override
    public Pizza crearPizza() {
        return new PizzaJamon();
    }
}
