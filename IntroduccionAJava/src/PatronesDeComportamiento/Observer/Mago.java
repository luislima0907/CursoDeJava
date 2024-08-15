package PatronesDeComportamiento.Observer;

public class Mago extends Enemigo implements MiObservador{
    public Mago(String nombre) {
        super(nombre);
        setEstado(false);
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " el mago esta atacando");
    }

    @Override
    public void activar() {
        setEstado(true);
        System.out.println(getNombre() + " el mago esta activado");
    }

    @Override
    public void actualizar() {
        activar();
        atacar();
    }
}
