package PatronesEstructurales.Flyweight;

import PatronesEstructurales.Flyweight.Activos.PreFabricado;

public class NPC {
    private static final int saludMaxima = 100;
    private static int id;
    private String nombre;
    private int salud;
    private Coordenada coordenadas;
    private PreFabricado preFabricado;

    public NPC(PreFabricado preFabricado) {
        this.nombre = "NPC" + id;
        this.salud = saludMaxima;
        this.coordenadas = Coordenada.getCoordenadas();
        this.preFabricado = preFabricado;
        id++;
    }

    public void mostrarNPC(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Salud: " + this.salud);
        System.out.println("Coordenadas: " + this.coordenadas.toString());
        System.out.println("PreFabricado: " + this.preFabricado.toString());
    }
}
