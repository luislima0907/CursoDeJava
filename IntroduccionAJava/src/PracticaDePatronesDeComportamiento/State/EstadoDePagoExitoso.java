package PracticaDePatronesDeComportamiento.State;

public class EstadoDePagoExitoso implements EstadoDeLaMaquinaDeLaTarjeta{
    private MaquinaDeTarjeta maquina;

//    public EstadoDePagoExitoso(MaquinaDeTarjeta maquina) {
//        this.maquina = maquina;
//    }

    @Override
    public void siguienteEstado(MaquinaDeTarjeta maquina) {
        this.maquina = maquina;
        //System.out.println("Tu pago ha sido recibido exitosamente");
        this.maquina.cambiarEstado(new EstadoDesactivado());
    }

    @Override
    public String imprimirEstado() {
        return "La maquina proceso exitosamente tu pago";
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
