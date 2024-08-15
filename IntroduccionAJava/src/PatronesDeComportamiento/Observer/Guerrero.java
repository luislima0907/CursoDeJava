package PatronesDeComportamiento.Observer;

public class Guerrero extends Enemigo implements MiObservador{
    public Guerrero(String nombre) {
        super(nombre);
        setEstado(false);
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " el guerrero esta atacado");
    }

    @Override
    public void activar() {
        setEstado(true);
        System.out.println(getNombre() + " el guerrero esta activado");
    }

    @Override
    public void actualizar() {
        activar();
        atacar();
    }
}
