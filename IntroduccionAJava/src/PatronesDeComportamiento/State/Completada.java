package PatronesDeComportamiento.State;

public class Completada implements EstadoDeLaMision{
    @Override
    public void siguiente(Mision mision) {
        System.out.println(mision.getNombre() + " esta completada, haz finalizado el juego");
    }

    @Override
    public String imprimir() {
        return " esta completada";
    }
}
