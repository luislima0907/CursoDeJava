package PatronesEstructurales.Flyweight;

import PatronesEstructurales.Flyweight.Activos.ActivosPrefabricados;
import PatronesEstructurales.Flyweight.Activos.PreFabricado;

public class NpcFactory {
    public static NPC crearNPC(PreFabricado preFabricado) {
        PreFabricado nuevoPrefabricado = ActivosPrefabricados.getPreFabricado(preFabricado);
        NPC npc = new NPC(nuevoPrefabricado);
        return npc;
    }
}
