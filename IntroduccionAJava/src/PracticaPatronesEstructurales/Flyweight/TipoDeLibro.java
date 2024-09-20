package PracticaPatronesEstructurales.Flyweight;

import lombok.ToString;

@ToString
public class TipoDeLibro {
    private final String tipo;
    private final String distribuidor;
    private final String otroDato;

    public TipoDeLibro(String tipo, String distribuidor, String otroDato) {
        this.tipo = tipo;
        this.distribuidor = distribuidor;
        this.otroDato = otroDato;
    }

    @Override
    public String toString() {
        return "TipoDeLibro{" +
                "tipo='" + tipo + '\'' +
                ", distribuidor='" + distribuidor + '\'' +
                ", otroDato='" + otroDato + '\'' +
                '}';
    }
}
