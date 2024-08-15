package PatronesDeComportamiento.State;

public class Progreso implements EstadoDeLaMision{
    @Override
    public void siguiente(Mision mision) {
        if (Math.random() < 0.5){
            mision.setEstadoDeLaMision(new Completada());
        }
        else {
            mision.setEstadoDeLaMision(new Fallida());
        }
    }

    @Override
    public String imprimir() {
        return " esta en progreso";
    }
}
