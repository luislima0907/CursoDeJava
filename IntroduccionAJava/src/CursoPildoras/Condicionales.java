package CursoPildoras;

import java.util.Scanner;

public class Condicionales {
    public void PracticaDeCondicionIf(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad por favor");
        int edadUsuario = entrada.nextInt();

        // para usar if debemos de usar los operadores
        // de comparacion, un if puede llevar un else que es lo que ejecuta el programa
        // si la condicion del if no es verdad o es diferente a lo que queremos
        if (edadUsuario > 0 && edadUsuario < 12)
        {
            System.out.println("Eres un niño");
        }
        else if (edadUsuario >= 18 && edadUsuario < 40)
        {
            System.out.println("Eres un adulto joven");
        }
        // Si queremos construir un if con else if, para que se
        // ejecuten los else if, la condicional original no debe cumplierse
        // y luego el programa evaluara cada condicion de tipo
        // else if que hayamos construido
        else if (edadUsuario >= 40 && edadUsuario < 60)
        {
            System.out.println("Ya eres adulto mayor");
        }
        else if (edadUsuario >= 60 && edadUsuario < 80)
        {
            System.out.println("Ya estas viejo");
        }
        else if (edadUsuario >= 80 && edadUsuario < 100)
        {
            System.out.println("Debes cuidarte, ya estas senil");
        }
        else if (edadUsuario >= 12 && edadUsuario < 18)
        {
            System.out.println("Eres adolescente");
        }
        else if (edadUsuario > 100)
        {
            System.out.println("Eres Dios?");
        }
        else if (edadUsuario < 0)
        {
            System.out.println("No has nacido XDD");
        }
    }
}
