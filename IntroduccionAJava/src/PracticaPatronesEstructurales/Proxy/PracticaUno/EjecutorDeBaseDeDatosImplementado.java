package PracticaPatronesEstructurales.Proxy.PracticaUno;

public class EjecutorDeBaseDeDatosImplementado implements EjecutorDeBaseDeDatos{
    @Override
    public void EjecutarConsulta(String consulta) {
        System.out.println("Ejecutando consulta: " + consulta);
    }
}
