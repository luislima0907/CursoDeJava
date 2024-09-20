package PracticaPatronesEstructurales.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class LibroFactory {
    private static final Map<String, TipoDeLibro> tipoDelibros = new HashMap<>();

    public static TipoDeLibro getTipoDelibro(String tipo, String distribuidor, String otroDato) {
        if (tipoDelibros.get(tipo) == null) {
            tipoDelibros.put(tipo, new TipoDeLibro(tipo, distribuidor, otroDato));
        }
        return tipoDelibros.get(tipo);
    }
}
