package CursoPildoras;

import javax.swing.*;

public class UsoDeArrays {
    public void Arrays() {
        // forma mas conveniente de declarar un array en java
        int[] edaddes = new int[5];

        // forma menos conveniente de declarar e inicializar un array en java
        int[] numeros = {3,2,4,5};

        // esta es otra forma de declarar una matriz o array
        // en java
        int miMatriz[] = new int[6];

        // darle valores a un array segun su indice
        edaddes[0] = 18;
        edaddes[1] = 20;
        edaddes[2] = 19;
        edaddes[3] = 15;
        edaddes[4] = 12;

        // imprimir el elemento segun su posicion
        System.out.println(miMatriz[0]);

        for(int i = 0; i < edaddes.length; i++) {
            System.out.println("El valor del indice " + i + " es: " + edaddes[i]);
        }

        // ejemplo de usar un foreach
        String[] paises = new String[8];
        int indice = 0;
        for (int i = 0; i < paises.length; i++) {
            paises[i] = JOptionPane.showInputDialog("Ingresa un pais");
        }
//        paises[0] = "Guatemala";
//        paises[1] = "Mexico";
//        paises[2] = "Argentina";
//        paises[3] = "Jamaica";
//        paises[4] = "Peru";
//        paises[5] = "Chile";
//        paises[6] = "Ecuador";
//        paises[7] = "Colombia";

        // para usar el foreach debemos de declararlo como un for normal
        // pero con la diferencia que dentro de los parentesis, ya no usaremos una declaracion, condicional e incrementador
        // para empezar el bucle, sino que solo declaramos una variable del mismo tipo del array que queremos recorrer
        // luego dos puntos y de ultimo el nombre del array
        for(String elemento: paises) {
            System.out.println("El pais del indice " + (indice++) + " es: " + elemento);
        }

        int[] numerosAleatorios = new int[20];
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int)Math.round(Math.random()*100);
        }
        for (int numeross: numerosAleatorios) {
            System.out.println(numeross);
        }
    }
}
