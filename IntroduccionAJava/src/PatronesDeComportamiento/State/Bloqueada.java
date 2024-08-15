package PatronesDeComportamiento.State;

public class Bloqueada implements EstadoDeLaMision{
    @Override
    public void siguiente(Mision mision) {
        mision.setEstadoDeLaMision(new Desbloqueada());
    }

    @Override
    public String imprimir() {
        return " esta bloqueada";
    }
}
