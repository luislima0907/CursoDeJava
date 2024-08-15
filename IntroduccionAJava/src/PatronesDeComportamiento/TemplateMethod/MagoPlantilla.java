package PatronesDeComportamiento.TemplateMethod;

public class MagoPlantilla extends EnemigoPlantilla{
    @Override
    public void setHabilidades() {
        System.out.println("Salud: 100, Mana: 100, Estamina: 50");
    }

    @Override
    public void atacar() {
        System.out.println("El mago ataca");
    }

    @Override
    public void proteger() {
        System.out.println("El mago se protege");
    }

    @Override
    public void resultado() {
        System.out.println("El mago ha sobrevivido");
    }
}
