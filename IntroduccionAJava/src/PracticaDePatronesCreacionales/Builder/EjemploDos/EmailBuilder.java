package PracticaDePatronesCreacionales.Builder.EjemploDos;

import java.util.ArrayList;
import java.util.Arrays;

public class EmailBuilder implements Builder {
    private Email email;

    public EmailBuilder() {
        this.email = new Email();
    }

    @Override
    public EmailBuilder destinatarios(String destinatarios) {
        if (this.email.getDestinatarios() == null){
            this.email.setDestinatarios(new ArrayList<>());
            if (destinatarios == null || destinatarios.isEmpty()) {
                throw new RuntimeException("Debes poner al menos un destinatario");
            } else {
                this.email.setDestinatarios(Arrays.asList(destinatarios.split(",")));
            }
        } else {
            if (destinatarios == null || destinatarios.isEmpty()) {
                throw new RuntimeException("Debes poner al menos un destinatario");
            } else {
                this.email.setDestinatarios(Arrays.asList(destinatarios.split(",")));
            }
        }
        return this;
    }

    @Override
    public EmailBuilder asunto(String asunto) {
        if (asunto == null || asunto.isEmpty()) {
            throw new RuntimeException("Debes colocar un asunto");
        }
        this.email.setAsunto(asunto);
        return this;
    }

    @Override
    public EmailBuilder cuerpo(String cuerpo) {
        if (cuerpo == null || cuerpo.isEmpty()) {
            throw new RuntimeException("Tu email debe tener un cuerpo");
        }
        this.email.setCuerpo(cuerpo);
        return this;
    }

    @Override
    public EmailBuilder adjuntos(String adjuntos) {
        if (this.email.getAdjuntos() == null){
            this.email.setAdjuntos(new ArrayList<>());
            if (adjuntos == null || adjuntos.isEmpty()) {
                adjuntos = "Sin archivos adjuntos";
                this.email.getAdjuntos().add(adjuntos);
            } else {
                this.email.setAdjuntos(Arrays.asList(adjuntos.split(",")));
            }
        }
        return this;
    }

    public Email build() {
        if (this.email.getDestinatarios() == null) {
            throw new RuntimeException("Debes poner al menos un destinatario");
        } else if (this.email.getCuerpo() == null) {
            throw new RuntimeException("Debes poner al menos un cuerpo");
        } else if (this.email.getAsunto() == null) {
            throw new RuntimeException("Debes poner al menos un asunto");
        } else if (this.email.getAdjuntos() == null) {
            this.email.setAdjuntos(new ArrayList<>());
            this.email.getAdjuntos().add("Sin archivos adjuntos");
        }
        email.setDestinatarios(email.getDestinatarios());
        email.setAsunto(email.getAsunto());
        email.setCuerpo(email.getCuerpo());
        email.setAdjuntos(email.getAdjuntos());
        return this.email;
    }
}
