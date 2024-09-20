package PracticaDePatronesDeComportamiento.Strategy;

public class Pato {
    private String nombre;
    private Quack quack;
    private Volar volar;
    private Mostrar mostrar;

    public Pato(String nombre) {
        this.nombre = nombre;
        //quack = new Quack();
    }

    public Pato(Quack quack, Volar volar, Mostrar mostrar) {
        this.quack = quack;
        this.volar = volar;
        this.mostrar = mostrar;
    }

    public void volar() {
        this.volar.volar();
    }
    public void quack() {
        this.quack.quack();
    }
    public void mostrar() {
        this.mostrar.mostrar();
    }
}
