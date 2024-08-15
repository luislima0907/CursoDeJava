package PatronesDeComportamiento.State;

public class Desbloqueada implements EstadoDeLaMision{
    @Override
    public void siguiente(Mision mision) {
        mision.setEstadoDeLaMision(new Progreso());
    }

    @Override
    public String imprimir() {
        return " esta desbloqueada";
    }
}
