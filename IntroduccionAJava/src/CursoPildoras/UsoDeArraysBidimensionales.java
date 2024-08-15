package CursoPildoras;

public class UsoDeArraysBidimensionales {
    public void ArraysConDosDimensiones() {
        // declaracion de un array de dos dimensiones
        // debemos de escribir dos corchetes seguido del tipo de dato que queremos en nuestro
        // array para decir que sera de mas de una dimension, y para indicarle cuantos elementos
        // queremos en cada array dentro de los corchetes colocamos el numero de elementos que contendra
        // cada posicion del array, es decir, el primer corchete serian las columnas de nuestro array
        // y el segundo corchete seran las filas
        int[][] matrix = new int[4][5];

        // en este caso, cada posicion del primer array puede contener 5 elementos
        matrix[0][0] = 20;
        matrix[0][1] = 2;
        matrix[0][2] = 34;
        matrix[0][3] = 90;
        matrix[0][4] = 5;

        matrix[1][0] = 0;
        matrix[1][1] = 3;
        matrix[1][2] = 4;
        matrix[1][3] = 9;
        matrix[1][4] = 56;

        matrix[2][0] = 200;
        matrix[2][1] = 24;
        matrix[2][2] = 346;
        matrix[2][3] = 907;
        matrix[2][4] = 58;

        matrix[3][0] = 201;
        matrix[3][1] = 22;
        matrix[3][2] = 343;
        matrix[3][3] = 902;
        matrix[3][4] = 54;

        // un ejemplo de for anidado, el primer for servira para recorrer
        // la primera dimension del array y el segundo sera para recorrer la segunda dimension
        // en resumen, el primer for en este caso recorrera los elementos que tenga en las 4 posiciones
        // del primer array o dimension y el segundo for recorrera los elementos que tenga la segunda
        // dimension u array.

        // el primer for en terminar su ciclo sera el que mas anidado este al for principal.
        // es decir, el for de i se ejecutara una vez por el flujo de ejecucion, pero
        // el valor de i no incrementara hasta que termine el ultimo ciclo for, en este caso de j
        // el primer valor de i sera 0 per una vez llegue al bucle de del for con j, la i seguira valiendo
        // 0 hasta que el bucle for con j termine, y una vez termine, el programa vuelve a ejecutar el
        // bucle for con i ya que la i ya no valdra 0 sino que 1, y asi sucesivamente.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("La posicion " + i + "|" + j + " de mi matriz de dos dimensiones es: " + matrix[i][j]);
            }
        }

    }
}
