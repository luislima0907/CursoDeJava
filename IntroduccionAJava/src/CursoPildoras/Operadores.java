package CursoPildoras;

public class Operadores {
    public void EjemploDeLosOperadores(){
        // ejemplo del operador suma
        double primerNumero = 5;
        double segundoNumero;
        segundoNumero = 10;
        double resultado = primerNumero + segundoNumero;
        // el metodo println imprime lo que le pasemos en los parametros del metodo
        // y despues hace un salto de linea, a diferencia del metodo print que
        // este imprime la instruccion de seguido sin dejar un salto de linea si es que
        // hubiera una impresion previa
        System.out.println("La suma de los dos numeros es: " + resultado);

        // ejemplo de incrementar una variable con los operadores
        primerNumero ++; // incrementa en 1
        segundoNumero += 5; // el valor que tiene la variable mas el valor que le agreguemos
        resultado = primerNumero - segundoNumero;
        System.out.println("La resta de los dos numeros es: " + resultado);

        // ejemplo de decrementar el valor de una variable
        primerNumero --; // decrementa su valor en 1
        segundoNumero -= 8; // lo que tiene la variable menos 10

        // ejemplo de division
        // las variables que utilizamos al momento de hacer una division
        // tienen que ser del mismo tipo, y para que sean mas exactas podemos usar double
        resultado = primerNumero / segundoNumero;
        System.out.println("La division de los dos numeros es: " + resultado);

        // declaracion de una constante, su valor despues no se podra cambiar.
        final double pi = 3.141516;

        // ejemplo de multiplicacion
        final double aCentimetros = 100;
        double metros = 40;
        double conversion = metros * aCentimetros;
        System.out.println("En " + metros + " metros hay " + conversion + " centimetros");

        // declarar varias variables y constantes en una misma linea
        int operadorUno, operadorDos, operadorResultado;
        operadorUno = 10;
        operadorDos = 20;
        operadorResultado = operadorUno - operadorDos;
        System.out.println("La resta de los dos operadores es: " + operadorResultado);
    }
}
