package PracticaPatronesEstructurales.Composite;

public class ServicioDeEntrega {
    private Caja caja;

    public void tomarPedido(Caja... cajas){
        this.caja = new CajaCompuesta(cajas);
    }

    public double calculcarPrecioDeLaCaja(){
        System.out.println("El precio de la caja es de ");
        return this.caja.calcularPrecio();
    }
}
