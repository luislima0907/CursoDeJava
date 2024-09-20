package PracticaDePatronesDeComportamiento.State;

public class EstadoDePagoFallido implements EstadoDeLaMaquinaDeLaTarjeta{
    private MaquinaDeTarjeta maquina;

//    public EstadoDePagoFallido(MaquinaDeTarjeta maquina) {
//        this.maquina = maquina;
//    }

    @Override
    public void siguienteEstado(MaquinaDeTarjeta maquina) {
        this.maquina = maquina;
        this.maquina.cambiarEstado(new EstadoActivado());
    }

    @Override
    public String imprimirEstado() {
        return "La maquina no pudo procesar tu pago bien, intenalo de nuevo";
    }

//    @Override
//    public void activar() {
//
//    }
//
//    @Override
//    public void procesarPago() {
//
//    }
//
//    @Override
//    public void pagoConExito() {
//
//    }
//
//    @Override
//    public void pagoFallido() {
//
//    }
}
