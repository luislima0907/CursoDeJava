package PracticaDePatronesCreacionales.Builder.EjemploUno;

public class PruebaBuilder {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
        builder.model("Chiron");
        System.out.println(builder.build());

    }
}
