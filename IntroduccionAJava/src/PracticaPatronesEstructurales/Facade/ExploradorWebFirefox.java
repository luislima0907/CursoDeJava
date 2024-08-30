package PracticaPatronesEstructurales.Facade;

import java.sql.Driver;

public class ExploradorWebFirefox {
    public static Driver getFirefoxDriver() {
        return null;
    }

    public static void generarReporteHTML(String prueba, Driver driver ) {
        System.out.println("Generando reporte en HTML con el driver de firefox");
    }

    public static void generarReporteJUnit(String prueba, Driver driver ) {
        System.out.println("Generando reporte en JUnit con el driver de firefox");
    }
}
