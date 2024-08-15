package PatronesEstructurales.Flyweight.Activos;

import java.util.ArrayList;
import java.util.List;

public class PreFabricado {
    private static int id;
    private String nombre;
    private List<Animacion> animaciones = new ArrayList<>();
    private List<Textura> texturas = new ArrayList<>();
    private List<Sonido> sonidos = new ArrayList<>();

    public PreFabricado(List<Animacion> animaciones, List<Textura> texturas, List<Sonido> sonidos) {
        this.nombre = "PreFabricado" + id;
        this.animaciones = animaciones;
        this.texturas = texturas;
        this.sonidos = sonidos;
        id++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\n' +
                "animaciones=" + animaciones + '\n' +
                "texturas=" + texturas + '\n' +
                "sonidos=" + sonidos;
    }
}
