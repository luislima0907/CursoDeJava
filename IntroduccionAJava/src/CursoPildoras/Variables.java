package CursoPildoras;

public class Variables {
    public void ComoUsarVariables(){
        // En java debemos inicializar una variable para poder usuarla en un futuro
        // por ende no tiene valores por defecto
        byte edad;
        edad = 19;

        // ejemplo de concatenar una string con una variable
        System.out.println("La edad de Luis es: " + edad);

        // ejemplo de declarar e inicializar una variable en una sola linea
        byte edadDeLeo = 24;
        // java es orientado a objetos(POO) es decir Programacion orientada a objetos
        // un ejemplo es el objeto out que significa salida que viene del espacio de nombres
        // system, y el objeto o clase out de ese espacio de nombres tiene un metodo
        // llamado println que sirve para imprimir un mensaje en consola.
        System.out.println("La edad de Leo es: " + edadDeLeo);
    }
}
