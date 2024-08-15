package PatronesEstructurales.Flyweight.Activos;

import java.util.HashMap;
import java.util.Map;

public class ActivosPrefabricados {
    private static Map<Integer, PreFabricado> preFabricadoMap = new HashMap<>();

    public static PreFabricado getPreFabricado(PreFabricado preFabricado) {
        int id = preFabricado.getId();
        if(!preFabricadoMap.containsKey(id)) {
            preFabricadoMap.put(id, preFabricado);
        }
        return preFabricadoMap.get(id);
    }
}
