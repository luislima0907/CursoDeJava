import CursoPildoras.*;

public class Main {
    public static void main(String[] args) {

        AccesoAUnaApp app = new AccesoAUnaApp();
        //app.PruebaDeClave();

        AdivinaUnNumero numero = new AdivinaUnNumero();
        //numero.Juego();

        PesoIdeal peso = new PesoIdeal();
        //peso.CalcularPesoDePersona();

        UsodelFor usodelFor = new UsodelFor();
        //usodelFor.ImprimirNombre();
        //usodelFor.ComprobarCorreo();
        //usodelFor.CalcularFactorial();

        UsoDeArrays arrays = new UsoDeArrays();
        //arrays.Arrays();

        UsoDeArraysBidimensionales arraysBidimensionales = new UsoDeArraysBidimensionales();
        arraysBidimensionales.ArraysConDosDimensiones();
    }
}