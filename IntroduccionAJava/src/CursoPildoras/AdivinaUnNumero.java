package CursoPildoras;

import java.util.Scanner;

public class AdivinaUnNumero {
    public void Juego(){
        int numeroAleatorio = (int) (Math.random() * 100);
        Scanner entrada = new Scanner(System.in);
        int contadorDeIntentos = 0;
        int numero;

        do {
            contadorDeIntentos++;
            System.out.println("Ingresa un numero por favor");
            numero = entrada.nextInt();

            if (numero == numeroAleatorio) {
                System.out.println("Has acertado el numero");
            }
            else if (numero > numeroAleatorio) {
                System.out.println("El numero ingresado es mayor");
            }
            else {
                System.out.println("El numero ingresado es menor");
            }
        }
        while (numero != numeroAleatorio);
        System.out.println("Te ha costado " + contadorDeIntentos + " intentos" +
                " en adivinar el numero aleatorio.");
    }
}
