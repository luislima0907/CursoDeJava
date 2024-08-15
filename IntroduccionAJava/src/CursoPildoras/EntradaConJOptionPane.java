package CursoPildoras;

import javax.swing.*;

public class EntradaConJOptionPane {
    public void EntradaJOptionPane() {
        //JOptionPane sirve para crear interfaces graficas para ingresar datos

        // la clase JOptionPane tiene un metodo showInputDialog sirve para ingresar
        // texto en una variable de tipo string
        String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre por favor");
        String edad = JOptionPane.showInputDialog("Ahora introduce tu edad");

        // Podemos convertir una string a un entero con la clase Integer y su metodo parseInt
        // que necesita un parametro de tipo string para hacer la conversion
        int edadIngresada = Integer.parseInt(edad);

        System.out.println("Hola " + nombreUsuario + " Tienes " + edad + " años");

        // otro ejemplo para ingresar numeros y hacer conversiones con JOptionPane
        String numero = JOptionPane.showInputDialog("Ingresa un numero y te diremos su raiz");
        double numeroConvertido = Double.parseDouble(numero);
        System.out.print("La raiz de " + numeroConvertido + " es: ");

        // el metodo printf le da un formato a una impresion que hagamos sobre un dato
        // de tipo double, es decir, podemos decidir cuantos decimales queremos ahi.
        System.out.printf("%1.2f", Math.sqrt(numeroConvertido));
    }
}
