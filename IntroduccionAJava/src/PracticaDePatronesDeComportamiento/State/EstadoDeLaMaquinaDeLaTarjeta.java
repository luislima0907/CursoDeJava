package PracticaDePatronesDeComportamiento.State;

public interface EstadoDeLaMaquinaDeLaTarjeta {
    public void siguienteEstado(MaquinaDeTarjeta maquina);
    public String imprimirEstado();
//    public void activar();
//    public void procesarPago();
//    public void pagoConExito();
//    public void pagoFallido();
}
