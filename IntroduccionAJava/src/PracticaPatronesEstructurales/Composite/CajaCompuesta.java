package PracticaPatronesEstructurales.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CajaCompuesta implements Caja{
    private final List<Caja> cajitas = new ArrayList<Caja>();

    public CajaCompuesta(Caja... cajas) {
        this.cajitas.addAll(Arrays.asList(cajas));
    }

    @Override
    public double calcularPrecio() {
        return this.cajitas.stream().mapToDouble(Caja::calcularPrecio).sum();
    }
}
