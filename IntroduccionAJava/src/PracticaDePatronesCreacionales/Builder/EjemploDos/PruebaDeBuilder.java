package PracticaDePatronesCreacionales.Builder.EjemploDos;

import java.util.ArrayList;
import java.util.List;

public class PruebaDeBuilder {
    public static void main(String[] args) {
        Email email = Email.builder()
                // Poner mas de un destinatario separado por ','
                .destinatarios("Luis,Carranza")
                .asunto("Hola mundo")
                .cuerpo("Mira el archivo")
                // Poner mas de un archivo adjunto separado por ','
                .adjuntos("parcialUnoProgra.pdf,parcialDosCalculo.pdf")
                .build();
        List<String> destinatarios = new ArrayList<>();
        destinatarios.add("L");
        email.setDestinatarios(destinatarios);
        System.out.println(email.toString());
    }
}
