package PatronesDeComportamiento.TemplateMethod;

public abstract class EnemigoPlantilla {

    public abstract void setHabilidades();
    public abstract void atacar();
    public abstract void proteger();
    public abstract void resultado();

    public final void plantilla() {
        setHabilidades();
        atacar();
        proteger();
        resultado();
    }
}
