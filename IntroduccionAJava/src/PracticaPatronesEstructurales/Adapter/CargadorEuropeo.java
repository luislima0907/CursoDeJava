package PracticaPatronesEstructurales.Adapter;

public class CargadorEuropeo {
    private String nombre;

    public CargadorEuropeo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void cargarTelefono(){
        System.out.println("Cargando telefono");
    }
}
