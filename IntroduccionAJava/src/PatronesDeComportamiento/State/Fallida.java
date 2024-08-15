package PatronesDeComportamiento.State;

public class Fallida implements EstadoDeLaMision{
    @Override
    public void siguiente(Mision mision) {
        mision.setEstadoDeLaMision(new Progreso());
    }

    @Override
    public String imprimir() {
        return " ha sido fallada";
    }
}
