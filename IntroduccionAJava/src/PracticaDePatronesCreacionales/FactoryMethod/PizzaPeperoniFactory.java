package PracticaDePatronesCreacionales.FactoryMethod;

public class PizzaPeperoniFactory extends PizzaFactory {
    @Override
    public Pizza crearPizza() {
        return new PizzaPeperoni();
    }
}
