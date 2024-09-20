package PracticaDePatronesDeComportamiento.Visitor;

public interface Visitor {

    public void visitar(Banco banco);
    public void visitar(Empresa empresa);
    public void visitar(Residente residente);
    public void visitar(Restaurante restaurante);
}
