package PatronesDeComportamiento.Visitor;

public class Guerrero implements Visitable{
    private String nombre;

    public Guerrero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ataqueDePoder(){
        System.out.println(getNombre() + " ataque de poder");
    }

    @Override
    public void aceptar(Visitador visitador) {
        visitador.visitar(this);
    }
}
