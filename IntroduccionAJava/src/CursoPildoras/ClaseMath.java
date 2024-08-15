package CursoPildoras;

public class ClaseMath {
    public void PracticaDeMath(){
        // las raices cuadradas de un numero siempre
        // estan dentro de un double
        double numeroUno = 9;

        // en el menu de intellisense nos da una ayuda sobre
        // lo que necesita el metodo para que funcione bien
        double raiz = Math.sqrt(numeroUno);

        System.out.println("La raiz de " + numeroUno + " es: " + raiz);

        // ejemplo de usar un dato de tipo float, debemos colocar f al final de los decimales
        // del numero
        float numero = 5.85f;
        int resultado = Math.round(numero);
        System.out.println(resultado);

        // el metodo round no permite convertir explicitamente el resultado
        // a un entero, debemos de hacer un casting antes de usar
        // el metodo round
        double numeroDos = 7.85;

        // un casting sirve para no perder informacion al momento de hacer una conversion
        int resultadoDos = (int)Math.round(numeroDos); // ejemplo de casting en java
        System.out.println(resultadoDos);

        double base = 5;
        double exponente = 3;
        // el metodo pow de math sirve para hacer potencias
        // el primer parametro es la base y el segundo es el exponente
        // ambos parametros deben ser un double y por ende el resultado tambien debe ser un double
        double resultadoTres = Math.pow(base, exponente); // podemos hacer un casting en caso de que lo necesitemos (int)
        System.out.println(resultadoTres);
    }
}
