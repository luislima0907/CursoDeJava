package PracticaDePatronesCreacionales.FactoryMethod;

public class PizzaJamon implements Pizza {
    @Override
    public void preparar() {
        System.out.println("Preparando Pizza de Jamon");
    }
}
