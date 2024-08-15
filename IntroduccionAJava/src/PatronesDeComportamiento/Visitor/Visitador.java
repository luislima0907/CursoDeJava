package PatronesDeComportamiento.Visitor;

public interface Visitador {
    public void visitar(Guerrero guerrero);
    public void visitar(Mago mago);
    public void visitar(Asesino asesino);
}
