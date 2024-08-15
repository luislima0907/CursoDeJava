package PatronesDeComportamiento.TemplateMethod;

public abstract class Plantilla {

    public abstract void pasoUno();

    public abstract void pasoDos();

    public abstract void pasoN();

    public final void plantilla() {
        pasoUno();
        pasoDos();
        pasoN();
    }
}
