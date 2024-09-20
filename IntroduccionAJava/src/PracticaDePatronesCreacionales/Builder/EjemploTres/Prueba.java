package PracticaDePatronesCreacionales.Builder.EjemploTres;

import java.util.ArrayList;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        Email email = new Email.EmailBuilder()
                .setDestinario("fernan@gmail.com")
                .setAsunto("oferta importante")
                .setCuerpo("25% de descuento en un producto")
                .build();
        List<String> dest = new ArrayList<>();
        dest.add("");
        email.setDestinatarios(dest);
        System.out.println(email);
    }
}
