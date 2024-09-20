package PracticaDePatronesDeComportamiento.State;

public class EstadoDesactivado implements EstadoDeLaMaquinaDeLaTarjeta{
    private MaquinaDeTarjeta maquina;

//    public EstadoDesactivado(MaquinaDeTarjeta maquina) {
//        this.maquina = maquina;
//    }

    @Override
    public void siguienteEstado(MaquinaDeTarjeta maquina) {
        this.maquina = maquina;
        this.maquina.cambiarEstado(new EstadoActivado());
    }

    @Override
    public String imprimirEstado() {
        return "La maquina esta desactivada";
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
