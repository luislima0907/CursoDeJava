package PracticaDePatronesDeComportamiento.State;

public class EstadoActivado implements EstadoDeLaMaquinaDeLaTarjeta{
    private MaquinaDeTarjeta maquina;

//    public EstadoActivado(MaquinaDeTarjeta maquina) {
//        this.maquina = maquina;
//    }

    @Override
    public void siguienteEstado(MaquinaDeTarjeta maquina) {
        this.maquina = maquina;
        this.maquina.cambiarEstado(new EstadoDeProcesoDePago());
    }

    @Override
    public String imprimirEstado() {
        return "La maquina esta activada";
    }
    //@Override
//    public void activar() {
//        // consigue el chip de la tarjeta para scanearla
//        // y asi poder activar la maquina
//        this.maquina.cambiarEstado(new EstadoActivado(this.maquina));
//        System.out.println("Maquina activada");
//    }
//
//    @Override
//    public void procesarPago() {
//        // ya se activo la maquina y reconocio la tarjeta, entonces ahora la esta procesando
//        this.maquina.cambiarEstado(new EstadoDeProcesoDePago(this.maquina));
//        System.out.println("Proceso de Pago, espere un momento");
//    }
//
//    @Override
//    public void pagoConExito() {
//        // El proceso del pago finalizo, entonces procede a cerrar
//        // la tarjeta y desactivar la maquina para que ya no haga mas
//        // pagos sobre esa tarjeta porque ya le notificaron que recibio el pago
//        this.maquina.cambiarEstado(new EstadoDesactivado(this.maquina));
//        System.out.println("El pago se hizo con exito, desactivando maquina");
//    }
//
//    @Override
//    public void pagoFallido() {
//        // el pago fallo en algun punto del proceso o porque no tenemos
//        // suficientes fondos, entonces no descativamos inmediatamente la maquina porque
//        // pudo haber sido un error del sistema o algo mas, entonces
//        // le damos un tiempo de espera para que lo vuelva intentar mas tarde
//        this.maquina.cambiarEstado(new EstadoActivado(this.maquina));
//        System.out.println("Error al pagar, intentelo de nuevo mas tarde");
//    }
}
