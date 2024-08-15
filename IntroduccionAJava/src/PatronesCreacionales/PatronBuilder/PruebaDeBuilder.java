package PatronesCreacionales.PatronBuilder;

public class PruebaDeBuilder {
    public static void main(String[] args) {
        // El patron builder sirve para que podamos crear un objeto
        // sin necesidad de un constructor, esto es posible cuando hagamos dos
        // clases que contendran lo mismo, en la primera clase se implementaran
        // los atributos y metodos getter y setter de estos, y la otra clase
        // se encargara de que los metodos setter esten en tipo builder, esto
        // ya lo tiene el lenguaje por defecto
        Enemigo enemigo = Enemigo.builder()
                .nombre("Juan")
                .tipo("Mago")
                .salud(100)
                .danio(50)
                .resistencia(150)
                .build();

        System.out.println(enemigo.toString());
    }
}
