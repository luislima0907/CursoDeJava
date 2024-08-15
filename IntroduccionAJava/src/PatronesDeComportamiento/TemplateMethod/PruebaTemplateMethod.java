package PatronesDeComportamiento.TemplateMethod;

public class PruebaTemplateMethod {
    public static void main(String[] args) {
        EnemigoPlantilla guerrero = new GuerreroPlantilla();
        EnemigoPlantilla mago = new MagoPlantilla();
        guerrero.plantilla();
        mago.plantilla();
//        Plantilla plantilla = new ConcretarPlantilla();
//        plantilla.plantilla();
    }
}
