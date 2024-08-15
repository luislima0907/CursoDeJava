package PatronesDeComportamiento.TemplateMethod;

public class ConcretarPlantilla extends Plantilla{
    @Override
    public void pasoUno() {
        System.out.println("Paso uno clase A");
    }

    @Override
    public void pasoDos() {
        System.out.println("Paso dos clase A");
    }

    @Override
    public void pasoN() {
        System.out.println("Paso N clase A");
    }
}
