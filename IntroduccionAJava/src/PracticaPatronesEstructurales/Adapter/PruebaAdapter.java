package PracticaPatronesEstructurales.Adapter;

public class PruebaAdapter {
    public static void main(String[] args) {
        CargadorEuropeo cargadorEuropeo = new CargadorEuropeo("Cargador de celular Poco de 90 watts");
        AdaptadorAmericano adaptador = new AdaptadorAmericano(cargadorEuropeo);
        adaptador.cargar();
    }
}
