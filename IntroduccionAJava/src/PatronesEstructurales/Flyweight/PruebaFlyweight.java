package PatronesEstructurales.Flyweight;

import PatronesEstructurales.Flyweight.Activos.Animacion;
import PatronesEstructurales.Flyweight.Activos.PreFabricado;
import PatronesEstructurales.Flyweight.Activos.Sonido;
import PatronesEstructurales.Flyweight.Activos.Textura;

import java.util.Arrays;
import java.util.List;

public class PruebaFlyweight {
    public static void main(String[] args) {
        List<Animacion> animaciones = Arrays.asList(
                new Animacion("Caminar"),
                new Animacion("Correr")
        );

        List<Textura> texturas = Arrays.asList(
                new Textura("verde"),
                new Textura("rojo")
        );

        List<Sonido> sonidos = Arrays.asList(
                new Sonido("bla"),
                new Sonido("ble")
        );

        PreFabricado preFabricado = new PreFabricado(animaciones, texturas, sonidos);
        NPC npcUno = new NPC(preFabricado);
        NPC npcDos = new NPC(preFabricado);
        System.out.println("NPC 1");
        npcUno.mostrarNPC();
        System.out.println("NPC 2");
        npcDos.mostrarNPC();
    }
}
