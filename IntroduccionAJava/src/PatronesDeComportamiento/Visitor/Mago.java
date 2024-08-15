package PatronesDeComportamiento.Visitor;

public class Mago implements Visitable{
    private String nombre;

    public Mago(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ataqueElemental(){
        System.out.println(getNombre() + " ataque elemental");
    }

    @Override
    public void aceptar(Visitador visitador) {
        visitador.visitar(this);
    }
}
