package CursoPildoras;

public class CompararCadenas {
    public void Comparar(){
        //Usamos la clase String para crear un objeto de cadenas de caracteres
        String nombre = "Luis";
        System.out.println("Mi nombre es: " + nombre);

        // el metodo lenght nos da cuantos caracteres hay una cadena de texto
        System.out.println("Mi nombre tiene: "+ nombre.length() + " letras.");

        // el metodo charAt() nos devuelve el carecter de una cadena
        // dandole como parametro un numero indice de referencia
        System.out.println("En el indice 3 de la cadena: "+ nombre + " esta la letra: " + nombre.charAt(3));
        int ultima_letra;
        ultima_letra = nombre.length();
        System.out.println("La ultima letra de " + nombre + " es la " + nombre.charAt(ultima_letra - 1));

        // el metodo substring() tiene sobrecarga de metodos,
        // el primero recibe un parametro, este parametro sera el indice
        // que tomaremos de referencia para que empiece a extraer de la cadena hasta la ultima posicion de la cadena.

        // el segundo recibe dos parametros, el primero es el indice de inicio
        // y el segundo es el indice de fin que queramos ver de la cadena que estamos evaluando
        String frase = "Hoy es un dia para aprender java";
        String fraseResumida = frase.substring(7, frase.length());
        System.out.println(fraseResumida);
        System.out.println(frase.substring(28));

        String alumnoUno, alumnoDos;
        alumnoUno = "Fernan";
        alumnoDos = "fernan";
        // el metodo equals compara dos cadenas de caracteres
        // y ve si son exactamente iguales, da true o false como resultado
        System.out.println(alumnoUno.equals(alumnoDos));

        // el metodo equalsIgnoreCase hace lo mismo que el equals pero
        // ignora mayusculas y minisculas y solo compara los textos por su valor
        System.out.println(alumnoUno.equalsIgnoreCase(alumnoDos));
    }
}
