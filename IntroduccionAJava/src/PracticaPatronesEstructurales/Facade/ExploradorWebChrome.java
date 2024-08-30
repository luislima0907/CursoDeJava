package PracticaPatronesEstructurales.Facade;

import java.sql.Driver;

public class ExploradorWebChrome {
    public static Driver getChromeDriver() {
        return null;
    }

    public static void generarReporteHTML(String prueba, Driver driver ) {
        System.out.println("Generando reporte en HTML con el driver de Chrome");
    }

    public static void generarReporteJUnit(String prueba, Driver driver ) {
        System.out.println("Generando reporte en JUnit con el driver de Chrome");
    }
}
