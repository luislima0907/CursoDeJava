package PracticaPatronesEstructurales.Facade;

public class PruebaFacade {
    public static void main(String[] args) {
        String prueba = "RevisarElElemento";
        ExploradorWebFacade.generarReportes("Chrome", "HTML", prueba);
        ExploradorWebFacade.generarReportes("Chrome", "JUNIT", prueba);
        ExploradorWebFacade.generarReportes("Firefox", "HTML", prueba);
        ExploradorWebFacade.generarReportes("Firefox", "JUNIT", prueba);
        ExploradorWebFacade.generarReportes("Fiefox", "JUNI", prueba);
    }
}
