package PracticaDePatronesDeComportamiento.Command;

public class Lampara {
    private String nombre;

    public Lampara(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void encender(){
        System.out.println("Lampara encendida");
    }

    public void apagar(){
        System.out.println("Lampara apagada");
    }
}
