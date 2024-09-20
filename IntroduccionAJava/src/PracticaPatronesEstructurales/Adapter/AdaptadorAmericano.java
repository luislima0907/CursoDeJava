package PracticaPatronesEstructurales.Adapter;

public class AdaptadorAmericano implements Carga{
    private CargadorEuropeo cargadorEuropeo;

    public AdaptadorAmericano(CargadorEuropeo cargadorEuropeo) {
        this.cargadorEuropeo = cargadorEuropeo;
//        cargadorEuropeo = new CargadorEuropeo("Xiaomi 90 watts");
    }

    @Override
    public void cargar() {
        System.out.println("Ejecutando adaptador americano para " + cargadorEuropeo.getNombre());
        cargadorEuropeo.cargarTelefono();
    }
}
