package PracticaDePatronesDeComportamiento.State;

public class MaquinaDeTarjeta {
    private EstadoDeLaMaquinaDeLaTarjeta estado;

    public MaquinaDeTarjeta() {
        this.estado = new EstadoDesactivado();
    }

    public void siguienteEstado() {
//        this.estado = new EstadoActivado(this);
        estado.siguienteEstado(this);
    }

    public void cambiarEstado(EstadoDeLaMaquinaDeLaTarjeta estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return this.estado.imprimirEstado();
    }

    //    public void activar() {
//        this.estado.activar();
//    }
//
//    public void procesarPago(){
//        this.estado.procesarPago();
//    }
//
//    public void pagoConExito(){
//        this.estado.pagoConExito();
//    }
//
//    public void pagoFallido() {
//        this.estado.pagoFallido();
//    }
}
