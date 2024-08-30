package PracticaPatronesEstructurales.Facade;

import java.sql.Driver;

// EJEMPLO DE FACADE
// esta clase manejara la logica de los comportamientos de varias clases que esten relacionadas
// a un fin en especifico, en este caso el explorador puede generar un reporte pero para eso
// el driver necesita el nombre del navegador y despues ve el tipo de reporte
// que el usuario quiera generar
public class ExploradorWebFacade {
    public static void generarReportes(String explorador, String reporte, String prueba){
        Driver driver = null;
        switch (explorador){
            case "Chrome":
                driver = ExploradorWebChrome.getChromeDriver();
                switch (reporte){
                    case "HTML":
                        ExploradorWebChrome.generarReporteHTML(prueba, driver);
                        break;
                    case "JUNIT":
                        ExploradorWebChrome.generarReporteJUnit(prueba, driver);
                        break;
                    default:
                        System.out.println("Por favor escriba una de las siguintes opciones: " +
                                "\nPARA REPORTES:" +
                                "\n1. HTML" +
                                "\n2. JUNIT");
                        break;
                }
                break;
            case "Firefox":
                driver = ExploradorWebFirefox.getFirefoxDriver();
                switch (reporte){
                    case "HTML":
                        ExploradorWebFirefox.generarReporteHTML(prueba, driver);
                        break;
                    case "JUNIT":
                        ExploradorWebFirefox.generarReporteJUnit(prueba, driver);
                        break;
                    default:
                        System.out.println("Por favor escriba una de las siguintes opciones: " +
                                "\nPARA REPORTES:" +
                                "\n1. HTML" +
                                "\n2. JUNIT");
                        break;
                }
                break;
            default:
                System.out.println("Por favor escriba una de las siguintes opciones: \nPARA NAVEGADORES" +
                        "\n1. Chrome" +
                        "\n2. Firefox" +
                        "\nPARA REPORTES:" +
                        "\n1. HTML" +
                        "\n2. JUNIT");
                break;
        }
    }
}
