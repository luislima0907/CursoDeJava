package PracticaDePatronesDeComportamiento.Observer;

public class ObservadorCelular implements Observador{
    private ObservableEstacionDeTiempo estacion;
    private String nombre;
    private String modelo;

    public ObservadorCelular(String nombre, String modelo, ObservableEstacionDeTiempo estacion) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.estacion = estacion;
    }

    @Override
    public void actualizar() {
        System.out.println("Mostrando informacion desde el celular: " + getNombre() + " " + getModelo());
        System.out.println("La temperatura de la estacion " + this.estacion.getNombre() + " es " + this.estacion.getTemperatura() + " grados");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
