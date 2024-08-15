package PatronesDeComportamiento.Mediator;

public class Compa implements Combate {
    private String nombre;
    private Mediator mediator;

    public Compa(String nombre, Mediator mediator) {
        this.nombre = nombre;
        this.mediator = mediator;
        mediator.agregar(this);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando el mensaje a: " + nombre);
        mediator.enviar(this);
    }

    @Override
    public void recibir(Combate combate) {
        System.out.println("Mensaje recibido de: " + ((Enemigo)combate).getNombre() + ": " + nombre + " Modo ataque activado");
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre;
    }
}
