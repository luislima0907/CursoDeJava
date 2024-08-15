package PatronesDeComportamiento.TemplateMethod;

public class GuerreroPlantilla extends EnemigoPlantilla{
    @Override
    public void setHabilidades() {
        System.out.println("Salud: 150, Mana: 0, Estamina: 150");
    }

    @Override
    public void atacar() {
        System.out.println("El guerrero ataca");
    }

    @Override
    public void proteger() {
        System.out.println("El guerrero se protege");
    }

    @Override
    public void resultado() {
        System.out.println("El guerrero ha sobrevivido");
    }
}
