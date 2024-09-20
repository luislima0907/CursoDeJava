package PracticaDePatronesDeComportamiento.Observer;

public class PruebaObserver {
    public static void main(String[] args) {
        ObservableEstacionDeTiempo estacion = new ObservableEstacionDeTiempo("Jalapax", 30);
        Observador celular = new ObservadorCelular("Poco", "F6", estacion);
        Observador iphone = new ObservadorCelular("Iphone", "15 pro", estacion);
        estacion.agregar(celular);
        estacion.agregar(iphone);
        estacion.notificarObservadores();
        System.out.println("SEGUNDA VUELTA");
        estacion.remover(iphone);
        estacion.notificarObservadores();
    }
}
