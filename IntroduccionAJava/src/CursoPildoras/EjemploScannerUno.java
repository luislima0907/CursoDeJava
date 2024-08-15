package CursoPildoras;

import java.util.Scanner;

public class EjemploScannerUno {
    public void EntradaScanner(){
        // Scanner sirve para crear interfaces en la consola
        // el metodo System.in sirve para que el usuario pueda ingresar algo en la consola
        Scanner entrada = new Scanner(System.in);

        // el metodo nextLine() nos sirve para ingresar texto en la consola y almacenarlo en
        // una variable de tipo string, tambien podemos hacer una conversion en caso de que sean
        // numeros con otro metodo o haciendo un casting
        System.out.println("Ingresa tu nombre");
        String nombreDelUsuario = entrada.nextLine();

        // el metodo nextInt() nos permite ingresar un numero entero
        // en consola y almacenarlo en una variable con el mismo tipo
        System.out.println("Ingresa tu edad");
        int edadDelUsuario = entrada.nextInt();

        System.out.println("El nombre ingresado es: " + nombreDelUsuario + " y la edad del usuario es: " + edadDelUsuario);
    }
}
