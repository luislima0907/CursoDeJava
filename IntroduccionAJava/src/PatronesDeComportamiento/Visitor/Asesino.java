package PatronesDeComportamiento.Visitor;

public class Asesino implements Visitable{
    private String nombre;

    public Asesino(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ataqueDeSigilo(){
        System.out.println(getNombre() + " ataque sigiloso");
    }

    @Override
    public void aceptar(Visitador visitador) {
        visitador.visitar(this);
    }
}
