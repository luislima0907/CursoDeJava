package PracticaDePatronesCreacionales.FactoryMethod;

public class PruebaFactoryMethod {
    public static void main(String[] args) {
        Pizza pizzaJamon = new PizzaJamonFactory().crearPizza();
        pizzaJamon.preparar();
        Pizza pizzaPeperoni = new PizzaPeperoniFactory().crearPizza();
        pizzaPeperoni.preparar();
    }
}
