package PatronesDeComportamiento.State;

public interface EstadoDeLaMision {
    public void siguiente(Mision mision);
    public String imprimir();
}
