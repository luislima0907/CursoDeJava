package CursoPildoras;

import javax.swing.*;

public class AccesoAUnaApp {
    public void PruebaDeClave(){
        String clave = "lol123";
        String password = "";
        // el bucle while repetira lo que tenga dentro mientras la condicion sea falsa
        // o no se cumpla
        while (clave.equals(password) == false) {
            password = JOptionPane.showInputDialog("Introduce la clave para pasar");

            if (clave.equals(password)== false){
                System.out.println("Clave incorrecta");
            }
            else if (clave.equals(password)== true){
                System.out.println("Clave correcta");
            }
        }
        System.out.println("Has pasado la prueba");
    }
}
