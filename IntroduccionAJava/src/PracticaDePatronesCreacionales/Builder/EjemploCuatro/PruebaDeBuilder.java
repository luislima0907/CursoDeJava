package PracticaDePatronesCreacionales.Builder.EjemploCuatro;

public class PruebaDeBuilder {
    public static void main(String[] args) {
        Game juegoDelSiglo = new GameBuilder()
                .equipoLocal("Pepe")
                .equipoRival("Jorge")
                .division("Tercera")
                .clima("Calor")
                .estadio("Bernabeu")
                .build();
        Game juego = new Game();
        System.out.println(juego.toString());
        System.out.println(juegoDelSiglo.toString());
        //gameBuilder.equipoLocal = "Luis";
        //Game game = gameBuilder.build();
//        Email email = Email.builder()
//                // Poner mas de un destinatario separado por ','
//                .destinatarios("Luis,Carranza")
//                .asunto("Hola mundo")
//                .cuerpo("Mira el archivo")
//                // Poner mas de un archivo adjunto separado por ','
//                .adjuntos("parcialUnoProgra.pdf,parcialDosCalculo.pdf")
//                .build();
//        email.setCuerpo("Mundo Hola");
//        System.out.println(email.toString());
    }
}
