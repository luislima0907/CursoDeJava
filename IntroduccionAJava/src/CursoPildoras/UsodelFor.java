package CursoPildoras;

import javax.swing.*;
import java.util.Scanner;

public class UsodelFor {
    public void ImprimirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = entrada.nextLine();

        for (int i = 0; i < 10; i++){
            System.out.println("Tu nombre es: " + nombre);
        }
    }
    public void ComprobarCorreo() {
        int arroba = 0;
        boolean punto = false;
        String correo = JOptionPane.showInputDialog("Introduce tu correo");

        for (int i = 0; i < correo.length(); i++) {
            if (correo.charAt(i)=='@'){
                arroba++;
            }
            if (correo.charAt(i) == '.'){
                punto = true;
            }
        }
        if (arroba == 1 && punto == true) {
            System.out.println("Es correcto");
        }
        else {
            System.out.println("No es correcto");
        }
    }
    public void CalcularFactorial() {
        int resultado = 1;
        int numeroFactorial = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        for (int i = numeroFactorial; i > 0; i--){
            resultado *= i;
        }
        System.out.println("el factorial de " + numeroFactorial + " es " + resultado);
    }
}
