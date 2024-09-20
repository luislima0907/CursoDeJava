package PracticaDePatronesCreacionales.FactoryMethod;

public class PizzaPeperoni implements Pizza {
    @Override
    public void preparar() {
        System.out.println("Preparando Pizza de peperoni");
    }
}
