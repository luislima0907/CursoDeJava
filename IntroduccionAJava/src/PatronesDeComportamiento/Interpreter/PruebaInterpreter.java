package PatronesDeComportamiento.Interpreter;

public class PruebaInterpreter {
    public static void main(String[] args) {
        String cadena = "5 1 2 + 4 * + 3 -";
        System.out.println("Resultado: " + new Interpretador(cadena).evaluar());
    }
}
