package PracticaDePatronesDeComportamiento.State;

public class EstadoDeProcesoDePago implements EstadoDeLaMaquinaDeLaTarjeta{
    private MaquinaDeTarjeta maquina;

//    public EstadoDeProcesoDePago(MaquinaDeTarjeta maquina) {
//        this.maquina = maquina;
//    }

    @Override
    public void siguienteEstado(MaquinaDeTarjeta maquina) {
        this.maquina = maquina;
        if(Math.random() < 0.5) {
            this.maquina.cambiarEstado(new EstadoDePagoFallido());
        } else {
            this.maquina.cambiarEstado(new EstadoDePagoExitoso());
        }
    }

    @Override
    public String imprimirEstado() {
        return "La maquina esta procesando el pago";
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
